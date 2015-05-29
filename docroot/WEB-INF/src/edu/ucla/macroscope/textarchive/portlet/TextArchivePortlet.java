package edu.ucla.macroscope.textarchive.portlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.jdbc.OutputBlob;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.upload.UploadRequest;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import edu.ucla.macroscope.textlibrary.model.MacroscopeDocument;
import edu.ucla.macroscope.textlibrary.service.MacroscopeDocumentLocalServiceUtil;

/**
 * Portlet implementation class TextArchivePortlet
 */
public class TextArchivePortlet extends MVCPortlet {
	
	public void showDataAssignmentScreen(ActionRequest request, ActionResponse response) {
		response.setRenderParameter("jspPage", "/html/textarchive/edit.jsp");
	}

	public void uploadFile(ActionRequest request, ActionResponse response) {
		System.out.println("Received file upload request");
		UploadRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
		File document = uploadRequest.getFile("document");
		try {
			InputStream stream = new FileInputStream(document);
			OutputBlob content = new OutputBlob(stream, document.length());
			long counter = CounterLocalServiceUtil.increment();
			MacroscopeDocument md = MacroscopeDocumentLocalServiceUtil.createMacroscopeDocument(counter);
			md.setContent(content);
			MacroscopeDocumentLocalServiceUtil.addMacroscopeDocument(md);
			response.setRenderParameter("jspPage", "/html/textarchive/showId.jsp");
			response.setProperty("id", counter + "");
			System.out.println("Should have returned response now");
		} catch (FileNotFoundException ex) {
			System.out.println("File not found, which should be impossible ...");
		} catch (SystemException sx) {
			System.out.println(sx);
		}
	}

}

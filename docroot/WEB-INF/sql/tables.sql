create table TL_Document (
	documentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	content VARCHAR(75) null,
	title VARCHAR(75) null,
	author VARCHAR(75) null,
	collection VARCHAR(75) null
);

create table TL_MacroscopeDocument (
	documentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	content BLOB,
	title VARCHAR(75) null,
	author VARCHAR(75) null,
	collection VARCHAR(75) null
);
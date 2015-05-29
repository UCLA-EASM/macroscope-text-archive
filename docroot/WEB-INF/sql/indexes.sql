create index IX_C9EF0CA7 on TL_Document (author);
create index IX_F6827BB9 on TL_Document (author, collection);
create index IX_87F63BFA on TL_Document (collection);
create index IX_C395C342 on TL_Document (groupId);
create index IX_EFA597A0 on TL_Document (title);

create index IX_40EBCC0F on TL_MacroscopeDocument (author);
create index IX_7A935F21 on TL_MacroscopeDocument (author, collection);
create index IX_AA350762 on TL_MacroscopeDocument (collection);
create index IX_2C30F0DA on TL_MacroscopeDocument (groupId);
create index IX_7FDF4B38 on TL_MacroscopeDocument (title);
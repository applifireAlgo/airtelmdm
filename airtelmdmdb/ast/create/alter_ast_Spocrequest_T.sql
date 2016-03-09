

ALTER TABLE `ast_Spocrequest_T` ADD CONSTRAINT FOREIGN KEY (`itemtypeid`) REFERENCES `ast_Itemtype_M`(`itemtypeid`);



ALTER TABLE `ast_Spocrequest_T` ADD CONSTRAINT FOREIGN KEY (`itemsubid`) REFERENCES `ast_Itemsubtype_M`(`itemsubtypeid`);



ALTER TABLE `ast_Spocrequest_T` ADD CONSTRAINT FOREIGN KEY (`manufacturerid`) REFERENCES `ast_Manufacturer_M`(`manufacturerid`);



ALTER TABLE `ast_Spocrequest_T` ADD CONSTRAINT FOREIGN KEY (`itemcategoryid`) REFERENCES `ast_Itemcategorytype_M`(`itemcategoryid`);



ALTER TABLE `ast_Spocrequest_T` ADD CONSTRAINT FOREIGN KEY (`itmmainid`) REFERENCES `ast_Itemmaintype_M`(`itemmaintypeid`);



ALTER TABLE `ast_Spocrequest_T` ADD CONSTRAINT FOREIGN KEY (`userid`) REFERENCES `ast_User_T`(`userId`);



ALTER TABLE `ast_Spocrequest_T` ADD CONSTRAINT FOREIGN KEY (`statusid`) REFERENCES `ast_Spocrequeststatus_M`(`statusid`);



ALTER TABLE `ast_Spocrequest_T` ADD CONSTRAINT FOREIGN KEY (`uomid`) REFERENCES `ast_Uom_M`(`uomid`);



ALTER TABLE `ast_Spocrequest_T` ADD CONSTRAINT FOREIGN KEY (`sbpid`) REFERENCES `ast_Sbp_M`(`sbpid`);


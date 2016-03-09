

ALTER TABLE `ast_Spocitem_M` ADD CONSTRAINT FOREIGN KEY (`itemtypeid`) REFERENCES `ast_Itemtype_M`(`itemtypeid`);



ALTER TABLE `ast_Spocitem_M` ADD CONSTRAINT FOREIGN KEY (`itemsubtypeid`) REFERENCES `ast_Itemsubtype_M`(`itemsubtypeid`);



ALTER TABLE `ast_Spocitem_M` ADD CONSTRAINT FOREIGN KEY (`manufacturerid`) REFERENCES `ast_Manufacturer_M`(`manufacturerid`);



ALTER TABLE `ast_Spocitem_M` ADD CONSTRAINT FOREIGN KEY (`itemcategoryid`) REFERENCES `ast_Itemcategorytype_M`(`itemcategoryid`);



ALTER TABLE `ast_Spocitem_M` ADD CONSTRAINT FOREIGN KEY (`itemmainid`) REFERENCES `ast_Itemmaintype_M`(`itemmaintypeid`);



ALTER TABLE `ast_Spocitem_M` ADD CONSTRAINT FOREIGN KEY (`technologyid`) REFERENCES `ast_Technology_M`(`technologyid`);



ALTER TABLE `ast_Spocitem_M` ADD CONSTRAINT FOREIGN KEY (`uomid`) REFERENCES `ast_Uom_M`(`uomid`);



ALTER TABLE `ast_Spocitem_M` ADD CONSTRAINT FOREIGN KEY (`sbpid`) REFERENCES `ast_Sbp_M`(`sbpid`);


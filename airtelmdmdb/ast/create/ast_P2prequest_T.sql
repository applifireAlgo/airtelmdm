DROP TABLE IF EXISTS `ast_P2prequest_T`;

CREATE TABLE `ast_P2prequest_T` ( `p2prequestid` VARCHAR(256) NOT NULL, `userid` VARCHAR(64) NOT NULL, `partnumber` VARCHAR(256) NOT NULL, `partdescription` VARCHAR(256) NOT NULL, `itemmainid` VARCHAR(256) NOT NULL, `itemsubid` VARCHAR(256) NOT NULL, `manufacturerid` VARCHAR(256) NOT NULL, `uomid` VARCHAR(256) NOT NULL, `itemcategoryid` VARCHAR(256) NOT NULL, `itemtypeid` VARCHAR(256) NOT NULL, `sbpid` VARCHAR(256) NOT NULL, `statusid` VARCHAR(256) NOT NULL, `createdBy` VARCHAR(64) NULL DEFAULT '-1', `createdDate` DATETIME NULL DEFAULT '1900-01-01', `updatedBy` VARCHAR(64) NULL DEFAULT '-1', `updatedDate` DATETIME NULL DEFAULT '1900-01-01', `versionId` INT(11) NULL DEFAULT '-1', `activeStatus` INT(1) NULL DEFAULT '1', `txnAccessCode` INT(11) NULL DEFAULT NULL, PRIMARY KEY (`p2prequestid`));

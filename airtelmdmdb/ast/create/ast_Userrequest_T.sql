DROP TABLE IF EXISTS `ast_Userrequest_T`;

CREATE TABLE `ast_Userrequest_T` ( `userrequestid` VARCHAR(256) NOT NULL, `userid` VARCHAR(64) NOT NULL, `circleid` VARCHAR(256) NOT NULL, `itemcode` VARCHAR(256) NOT NULL, `itemdescription` VARCHAR(256) NOT NULL, `statusid` VARCHAR(256) NOT NULL, `createdBy` VARCHAR(64) NULL DEFAULT '-1', `createdDate` DATETIME NULL DEFAULT '1900-01-01', `updatedBy` VARCHAR(64) NULL DEFAULT '-1', `updatedDate` DATETIME NULL DEFAULT '1900-01-01', `versionId` INT(11) NULL DEFAULT '-1', `activeStatus` INT(1) NULL DEFAULT '1', `txnAccessCode` INT(11) NULL DEFAULT NULL, PRIMARY KEY (`userrequestid`));


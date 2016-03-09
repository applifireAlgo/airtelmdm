

ALTER TABLE `ast_Userrequest_T` ADD CONSTRAINT FOREIGN KEY (`userid`) REFERENCES `ast_User_T`(`userId`);



ALTER TABLE `ast_Userrequest_T` ADD CONSTRAINT FOREIGN KEY (`circleid`) REFERENCES `ast_Circle_M`(`circleid`);



ALTER TABLE `ast_Userrequest_T` ADD CONSTRAINT FOREIGN KEY (`statusid`) REFERENCES `ast_Userrequeststatus_M`(`statusid`);


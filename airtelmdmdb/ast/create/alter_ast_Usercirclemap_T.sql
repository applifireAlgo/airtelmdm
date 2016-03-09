

ALTER TABLE `ast_Usercirclemap_T` ADD CONSTRAINT FOREIGN KEY (`userid`) REFERENCES `ast_User_T`(`userId`);



ALTER TABLE `ast_Usercirclemap_T` ADD CONSTRAINT FOREIGN KEY (`circleid`) REFERENCES `ast_Circle_M`(`circleid`);




ALTER TABLE `ast_P2pitemcircle_T` ADD CONSTRAINT FOREIGN KEY (`circleid`) REFERENCES `ast_Circle_M`(`circleid`);



ALTER TABLE `ast_P2pitemcircle_T` ADD CONSTRAINT FOREIGN KEY (`itemid`) REFERENCES `ast_P2pitem_M`(`itemid`);


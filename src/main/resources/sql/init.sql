DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`   varchar(50),
    `name` varchar(50) ,
    `userType`  varchar(10) ,
    `point`  decimal
);
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`
(
    `id`   varchar(50),
    `userId` varchar(50),
    `price`  decimal
);
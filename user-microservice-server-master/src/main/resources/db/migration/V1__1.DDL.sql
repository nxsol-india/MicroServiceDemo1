CREATE TABLE `countryinfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `userinfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `countryid` bigint(20) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);




INSERT INTO `countryinfo` (`id`, `name`) VALUES ('1', 'India');
INSERT INTO `countryinfo` (`id`, `name`) VALUES ('2', 'US');
INSERT INTO `countryinfo` (`id`, `name`) VALUES ('3', 'UK');


INSERT INTO `userinfo` (`id`, `countryid`, `email`, `name`) VALUES ('1', '1', 'test1@gmail.com', 'test1');
INSERT INTO `userinfo` (`id`, `countryid`, `email`, `name`) VALUES ('2', '2', 'test2@gmail.com', 'test2');
INSERT INTO `userinfo` (`id`, `countryid`, `email`, `name`) VALUES ('3', '3', 'test3@gmail.com', 'test3');

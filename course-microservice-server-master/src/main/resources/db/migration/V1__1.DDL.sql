CREATE TABLE `courseinfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `course_country_id` bigint(20) DEFAULT NULL,
  `institute_name` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price_domestic` bigint(20) DEFAULT NULL,
  `price_international` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
);










INSERT INTO `courseinfo` (`id`, `course_country_id`, `institute_name`, `name`, `price_domestic`, `price_international`) VALUES (1,1,'oxford','Spring Boot',175,200);
INSERT INTO `courseinfo` (`id`, `course_country_id`, `institute_name`, `name`, `price_domestic`, `price_international`) VALUES (2,2,'cambridge','J2ee',225,275);
INSERT INTO `courseinfo` (`id`, `course_country_id`, `institute_name`, `name`, `price_domestic`, `price_international`) VALUES (3,2,'pennsylvania','PHP',125,145);



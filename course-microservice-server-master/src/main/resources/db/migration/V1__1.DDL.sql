CREATE TABLE `courseinfo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `course_country_id` bigint(20) DEFAULT NULL,
  `institute_name` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price_domestic` bigint(20) DEFAULT NULL,
  `price_international` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

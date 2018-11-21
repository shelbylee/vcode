CREATE TABLE IF NOT EXISTS `user` (
    `id` BIGINT PRIMARY KEY AUTO_INCREMENT,
    `username` VARCHAR(32) NOT NULL UNIQUE,
    `password` CHAR(32) NOT NULL,
    `email` VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS `problem` (
    `id` BIGINT PRIMARY KEY AUTO_INCREMENT,
    `source` VARCHAR(32) NOT NULL,
    `title` VARCHAR(255) NOT NULL UNIQUE,
    `content` TEXT NOT NULL,
);

CREATE TABLE IF NOT EXISTS `submission` (
    `id` BIGINT PRIMARY KEY AUTO_INCREMENT,
    `title` VARCHAR(255) NOT NULL UNIQUE,
);

CREATE TABLE IF NOT EXISTS `contest` (
    `id` BIGINT PRIMARY KEY AUTO_INCREMENT,
    `title` VARCHAR(255) NOT NULL UNIQUE
);

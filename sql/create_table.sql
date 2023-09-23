-- Tạo bảng "information"
CREATE TABLE information (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    intro TEXT,
    date_created DATE,
    img_url VARCHAR(255),
    telephone VARCHAR(20),
    mobilephone VARCHAR(20),
    fax VARCHAR(20),
    email VARCHAR(255),
    address TEXT,
    country VARCHAR(255),
    opened_time TIME,
    closed_time TIME,
    off_day VARCHAR(255)
);

-- Tạo bảng "post"
CREATE TABLE post (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255),
    content TEXT,
    date_created DATE,
    img_url VARCHAR(255)
);

-- Tạo bảng "course"
CREATE TABLE course (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    info TEXT,
    price DECIMAL(10, 2),
    title VARCHAR(255),
    content TEXT,
    date_created DATE,
    img_url VARCHAR(255)
);

-- Tạo bảng "service"
CREATE TABLE service (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    info TEXT,
    price DECIMAL(10, 2),
    title VARCHAR(255),
    content TEXT,
    date_created DATE,
    img_url VARCHAR(255)
);

-- Tạo bảng "employee"
CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    department VARCHAR(255),
    role VARCHAR(255),
    content TEXT,
    img_url VARCHAR(255)
);

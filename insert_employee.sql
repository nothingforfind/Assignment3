SELECT * FROM employee;

ALTER TABLE employee
ADD COLUMN service_id INT;

ALTER TABLE employee
ADD CONSTRAINT fk_employee_service
FOREIGN KEY (service_id)
REFERENCES service(id);

-- Chèn 10 nhân viên vào bảng "employee" và liên kết với các dịch vụ
INSERT INTO employee (name, department, role, content, img_url, service_id)
VALUES
    ('Micheal Z', 
    'Marketing', 
    'Employee', 
    'In the dynamic world of marketing, one name that consistently shines is Michael Z. As a key member of the Marketing Department, Michael has established himself as a true maestro in the art of promoting and elevating brands. With an impressive blend of creativity, strategic thinking, and a deep understanding of consumer behavior, Michael Z has become an invaluable asset to the marketing team.

Michael\'s journey in the field of marketing has been nothing short of inspiring. Armed with a passion for storytelling and a keen eye for market trends, he has consistently delivered exceptional results for the brands he\'s worked with. Whether it\'s crafting compelling ad campaigns, analyzing market data, or devising innovative strategies, Michael\'s contributions have consistently propelled the Marketing Department and the brands under its purview to new heights of success.

One of Michael\'s standout qualities is his ability to adapt to the ever-changing landscape of the digital age. In a world where social media, online advertising, and influencer marketing dominate, he has been at the forefront of harnessing these trends to connect with audiences effectively. His knack for staying ahead of the curve has not only kept the Marketing Department relevant but has also ensured that the brands he oversees maintain a competitive edge in their respective markets.

Beyond his professional accomplishments, Michael Z is known for his collaborative spirit and leadership within the Marketing Department. His enthusiasm and dedication to mentoring junior team members have created a nurturing environment where talent flourishes. His charisma and ability to inspire others make him not only a remarkable marketer but also an excellent colleague.

In summary, Michael Z is a marketing maestro who brings a blend of creativity, strategy, and adaptability to the Marketing Department. His contributions have been instrumental in the success of the department and the brands it serves, making him an indispensable asset in the world of marketing.',
    
    'https://imgv3.fotor.com/images/gallery/Realistic-Male-Profile-Picture.jpg', 
    3);

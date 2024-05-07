
INSERT INTO `khoa_hoc` (`makh`, `tenkh`) VALUES 
    (2, '2021'),
    (3, '2022'),
    (4, '2023'),
    (5, '2020'),
    (6, '2019');

INSERT INTO `ttcs`.`khoa` (`mak`, `tenk`)
VALUES 
    ('1', 'CNTT'),
    ('2', 'Kinh tế'),
    ('3', 'Ngoại ngữ');
    
insert into `ttcs`.`role` (`id`,`role_name`)
values
	('1', 'admin'),
    ('2', 'giangvien');
    
INSERT INTO `ttcs`.`giang_vien` (`magv`, `gioi_tinh`, `password`, `tengv`, `username`, `is_active`, `email`, `role_id`)
VALUES 
    ('KM001', 'Nữ', 'KM001', 'Nguyễn Thị Hồng', 'KM001', TRUE,'km001@gmail.com', 2),
    ('KM002', 'Nam', 'KM002', 'Trần Văn An', 'KM002', TRUE,'km002@gmail.com', 2),
    ('KM003', 'Nữ', 'KM003', 'Lê Thị Lan', 'KM003', TRUE,'km003@gmail.com', 2),
    ('KM004', 'Nam', 'KM004', 'Phạm Văn Bình', 'KM004', TRUE,'km004@gmail.com', 2),
    ('KM005', 'Nữ', 'KM005', 'Đặng Thị Hương', 'KM005', TRUE,'km005@gmail.com', 2),
    ('KM006', 'Nam', 'KM006', 'Hoàng Văn Đức', 'KM006', TRUE,'km006@gmail.com', 2),
    ('KM007', 'Nữ', 'KM007', 'Nguyễn Thị Mai', 'KM007', TRUE,'km007@gmail.com', 2),
    ('KM008', 'Nam', 'KM008', 'Lê Văn Dũng', 'KM008', TRUE,'km008@gmail.com', 2),
    ('KM009', 'Nữ', 'KM009', 'Trần Thị Bích', 'KM009', TRUE,'km009@gmail.com', 2),
    ('KM010', 'Nam', 'KM010', 'Phạm Văn Nam', 'KM010', TRUE,'km010@gmail.com', 2);

INSERT INTO `ttcs`.`lop` (`ma_lop`, `ten_lop`,`magv`,`makh`,`mak`)
VALUES 
    ('CN01', 'D21CQCN001-B','KM001',2,1),
    ('CN02', 'D21CQCN002-B','KM002',2,1),
    ('CN03', 'D21CQCN003-B','KM003',2,1),
    ('CN04', 'D21CQCN004-B','KM004',2,1),
    ('CN05', 'D21CQCN005-B','KM005',2,1),
    ('CN06', 'D21CQCN006-B','KM006',2,1),
    ('CN07', 'D21CQCN007-B','KM007',2,1),
    ('CN08', 'D21CQCN008-B','KM008',2,1),
    ('CN09', 'D21CQCN009-B','KM009',2,1),
    ('CN10', 'D21CQCN010-B','KM010',2,1);
    
INSERT INTO `ttcs`.`sinh_vien` (`masv`, `gioi_tinh`, `password`, `tensv`, `username`, `is_active`,`email`, `ma_lop`)
VALUES 
    ('B21DCCN01', 'nam', 'B21DCCN001', 'Đào Thị Định', 'B21DCCN001', true,'dtd1@gmail.com','CN05'),
    ('B21DCCN012', 'nu', 'B21DCCN002', 'Nguyễn Văn A', 'B21DCCN002', TRUE,'dtd2@gmail.com','CN05'),
    ('B21DCCN003', 'nam', 'B21DCCN003', 'Trần Thị Bích', 'B21DCCN003', TRUe,'dtd3@gmail.com','CN05'),
    ('B21DCCN004', 'nu', 'B21DCCN004', 'Lê Văn Cường', 'B21DCCN004', TRUE,'dtd4@gmail.com','CN05'),
    ('B21DCCN005', 'nam', 'B21DCCN005', 'Phạm Thị Dung', 'B21DCCN005', TRUE,'dtd5@gmail.com','CN05'),
    ('B21DCCN006', 'nu', 'B21DCCN006', 'Hoàng Văn Đức', 'B21DCCN006', TRUE,'dtd6@gmail.com','CN06'),
    ('B21DCCN007', 'nam', 'B21DCCN007', 'Nguyễn Thị Hà', 'B21DCCN007', TRUE,'dtd7@gmail.com','CN06'),
    ('B21DCCN008', 'nu', 'B21DCCN008', 'Lê Thị Lan', 'B21DCCN008', TRUE,'dtd8@gmail.com','CN06'),
    ('B21DCCN009', 'nam', 'B21DCCN009', 'Trần Văn Minh', 'B21DCCN009', TRUE,'dtd9@gmail.com','CN06'),
    ('B21DCCN010', 'nu', 'B21DCCN010', 'Phạm Văn Nam', 'B21DCCN010', FALSE,'dtd10@gmail.com','CN06');


INSERT INTO `ttcs`.`mon_hoc` (`mamh`, `so_tin_chi`, `tenmh`)
VALUES 
    ('INT001', '3', 'Lập trình hướng đối tượng'),
    ('INT002', '2', 'Cấu trúc dữ liệu và giải thuật'),
    ('INT003', '3', 'Cơ sở dữ liệu'),
    ('INT004', '3', 'Mạng máy tính'),
    ('INT005', '2', 'Toán cao cấp'),
    ('INT006', '3', 'Tiếng Anh chuyên ngành'),
    ('INT007', '3', 'Pháp luật đại cương'),
    ('INT008', '2', 'Marketing cơ bản'),
    ('INT009', '3', 'Kỹ năng làm việc nhóm'),
    ('INT010', '2', 'Quản trị học');
    

INSERT INTO `ttcs`.`diem` (`diem_giua_ky`, `diem_cuoi_ky`, `diem_tong_ket`, `id`, `hoc_ky`, `mamh`, `masv`) VALUES 
    ('7', '7','7', '1', 'Học kỳ 1', 'INT001', 'B21DCCN001'),
    ('7', '7', '7','2', 'Học kỳ 1', 'INT002', 'B21DCCN001'),
    ('8', '8', '8','3', 'Học kỳ 1', 'INT003', 'B21DCCN001'),
    ('8', '8', '8','4', 'Học kỳ 1', 'INT004', 'B21DCCN001'),
    ('5', '5', '5','5', 'Học kỳ 1', 'INT005', 'B21DCCN001'),
    ('5', '5', '5','6', 'Học kỳ 1', 'INT006', 'B21DCCN001'),
    ('9', '9', '9','7', 'Học kỳ 1', 'INT007', 'B21DCCN001'),
    ('8', '8', '8','8', 'Học kỳ 1', 'INT008', 'B21DCCN001'),
    ('9', '9', '9','9', 'Học kỳ 1', 'INT009', 'B21DCCN001'),
    ('8', '8', '8','10', 'Học kỳ 1', 'INT010', 'B21DCCN001');
    
    



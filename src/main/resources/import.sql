
INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Sinclair', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);

INSERT INTO tb_course (name, img_uri, img_gray_uri) values ('Bootcamp FrontEnd', '/Users/rodrigoweber/Downloads/dslearn/src/main/resources/images/images.jpeg', '/Users/rodrigoweber/Downloads/dslearn/src/main/resources/images/RMhVjjVD4x1sL1vNnEx6BBFITf9eaEPedch3nfqs.png');

INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2024-07-14T10:00:00Z', TIMESTAMP WITH TIME ZONE '2025-07-14T10:00:00Z', 1);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2024-12-14T10:00:00Z', TIMESTAMP WITH TIME ZONE '2025-12-14T10:00:00Z', 1);

INSERT INTO tb_resource (title, description, position, img_uri, type, offer_id) VALUES ('Trilha HTML', 'Trilha inicial do Curso de Front', 1, '/Users/rodrigoweber/Downloads/dslearn/src/main/resources/images/front-end-developer-1024x512.png', 1, 1);
INSERT INTO tb_resource (title, description, position, img_uri, type, offer_id) VALUES ('Forum', 'Tire suas dúvidas', 2, '/Users/rodrigoweber/Downloads/dslearn/src/main/resources/images/front-end-developer-1024x512.png', 2, 1);
INSERT INTO tb_resource (title, description, position, img_uri, type, offer_id) VALUES ('Lives', 'Lives exclusivas para a turma', 3, '/Users/rodrigoweber/Downloads/dslearn/src/main/resources/images/front-end-developer-1024x512.png', 0, 1);

INSERT INTO tb_section (title, description, position, img_uri, resource_id, prerequisite_id) VALUES ('Capítulo 01', 'Neste capítulo iremos começar com o básico de HTML', 1, '/Users/rodrigoweber/Downloads/dslearn/src/main/resources/images/front-end-developer-1024x512.png', 1, null) ;
INSERT INTO tb_section (title, description, position, img_uri, resource_id, prerequisite_id) VALUES ('Capítulo 02', 'Neste capítulo iremos continuar com o básico de HTML', 2, '/Users/rodrigoweber/Downloads/dslearn/src/main/resources/images/front-end-developer-1024x512.png', 1, 1) ;
INSERT INTO tb_section (title, description, position, img_uri, resource_id, prerequisite_id) VALUES ('Capítulo 03', 'Neste capítulo iremos finalizar com o básico de HTML', 3, '/Users/rodrigoweber/Downloads/dslearn/src/main/resources/images/front-end-developer-1024x512.png', 1, 2) ;

INSERT INTO tb_enrollment (user_id, offer_id, enroll_moment, refund_moment, available, only_update) VALUES (1, 1, TIMESTAMP WITH TIME ZONE '2024-07-14T10:00:00Z', null, true, false);
INSERT INTO tb_enrollment (user_id, offer_id, enroll_moment, refund_moment, available, only_update) VALUES (2, 1, TIMESTAMP WITH TIME ZONE '2024-07-14T10:00:00Z', null, true, false);
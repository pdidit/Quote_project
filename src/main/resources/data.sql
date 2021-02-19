INSERT INTO client(first_name, last_name, eircode, email, phone_number) VALUES('Padraic', 'Meehan', 'H91YC2Y', 'padraic.meehan@gmail.com', '0872741283');
INSERT INTO client(first_name, last_name, eircode, email, phone_number) VALUES('Raquel', 'Villadangos', 'H91YC2Y', 'Raquel.villadagos@gmail.com', '0873213543');
INSERT INTO client(first_name, last_name, eircode, email, phone_number) VALUES('Cillian', 'Meehan', 'H91YC2Y', 'cillian.meehan@gmail.com', '0872741283');

INSERT INTO job(job_title, description, job_price) VALUES('Roofing', 'Placing titles or slates of your choicing on the roof', 500.00);
INSERT INTO job(job_title, description, job_price) VALUES('Flooring', 'Placing flooring on the ground', 560.00);
INSERT INTO job(job_title, description, job_price) VALUES('Walls', 'Setting up walls for first Fixings', 1000.00);


INSERT INTO quote(client_id, quote_total, comments, quote_address_first_line) VALUES(1, 500.00, 'This is test comment', 'galway');

INSERT INTO quote_jobs(quote_id, jobs_id) VALUES(1, 1);
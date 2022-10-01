INSERT INTO restaurante (cep, complemento, nome) VALUES ('00000001', 'Rua das Aguias', 'Restaurante Peixe Dourado');
INSERT INTO restaurante (cep, complemento, nome) VALUES ('00000002', 'Rua das Tartarugas', 'Restaurante do mar');

INSERT INTO cliente (cep, complemento, nome) VALUES ('00000001', 'Rua das Onças', 'Alisson Youssf');
INSERT INTO cliente (cep, complemento, nome) VALUES ('00000002', 'Rua das Bençãos', 'Link Informática');

INSERT INTO produto (disponivel, nome, valor_unitario, restaurante_id) VALUES (true, 'Mesa', '150.0', 1L);
INSERT INTO produto (disponivel, nome, valor_unitario, restaurante_id) VALUES (true, 'TV', '1950.0', 1L);
INSERT INTO produto (disponivel, nome, valor_unitario, restaurante_id) VALUES (true, 'Notebook', '3541.0', 2L);

INSERT INTO sacola (forma_pagamento, fechada, valor_total, cliente_id) VALUES (0, false, 0.0, 1L);


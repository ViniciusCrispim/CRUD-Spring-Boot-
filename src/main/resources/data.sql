
INSERT INTO t_usuario  (id, nome, login, senha, email) VALUES('1','Test', 'test@', '123', 'teste@email.com');
INSERT INTO t_usuario  (id, nome, login, senha, email) VALUES('2','Adm', 'adm@', '456', 'adm@email.com');

ALTER SEQUENCE t_usuario_id_seq RESTART WITH 3 INCREMENT BY 1;

INSERT INTO t_perfil (id, descricao) VALUES ('1', 'Test');
INSERT INTO t_perfil (id, descricao) VALUES ('2', 'User');
INSERT INTO t_perfil (id, descricao) VALUES ('3', 'Adm');

ALTER SEQUENCE t_perfil_seq RESTART WITH 4 INCREMENT BY 1;

INSERT INTO t_recurso (id, nome, chave ) VALUES ('1', 'Tela Usuário', 'usuario');
INSERT INTO t_recurso (id, nome, chave ) VALUES ('2', 'Tela Perfil', 'perfil');
INSERT INTO t_recurso (id, nome, chave ) VALUES ('3', 'Tela Recurso', 'recurso');

ALTER SEQUENCE t_recurso_seq RESTART WITH 4 INCREMENT BY 1;



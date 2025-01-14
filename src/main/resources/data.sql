


INSERT INTO t_usuario  ( nome, login, senha, email) VALUES('Test', 'test@', '123', 'teste@email.com');
INSERT INTO t_usuario  ( nome, login, senha, email) VALUES('Adm', 'adm@', '456', 'adm@email.com');

ALTER SEQUENCE t_usuario_id_seq RESTART WITH 2;

INSERT INTO t_perfil (id, descricao) VALUES ('1', 'Test');
INSERT INTO t_perfil (id, descricao) VALUES ('2', 'Adm');

ALTER SEQUENCE t_perfil_seq RESTART WITH 2;

# API_VollMed_SpringBoot

# Projeto Web para Clinica de Médicos

-Tecnologias Usadas:

![download](https://github.com/ygorkwan2001/API_VollMed_SpringBoot/assets/88592898/9ecacac2-c692-49cb-b5a1-f59dd5168a6a)

![download](https://github.com/ygorkwan2001/API_VollMed_SpringBoot/assets/88592898/687599c2-6561-4a64-831e-b76cd80a9afc)

![Spring_Security](https://github.com/ygorkwan2001/API_VollMed_SpringBoot/assets/88592898/5c60ac06-a424-4da4-9cd0-97e8afe4be82)

![download](https://github.com/ygorkwan2001/API_VollMed_SpringBoot/assets/88592898/55c7f0c1-b830-4a06-a587-f1705bb35ece)


![images](https://github.com/ygorkwan2001/API_VollMed_SpringBoot/assets/88592898/1717c2ad-442c-430c-8fee-cd720f565e18)


Bibliotecas: Flyway,Lombok, Migrations, Validation

## Regras de Negocio

Cadastro:

Descrição
O sistema deve possuir uma funcionalidade de cadastro de médicos, na qual as seguintes informações deverão ser preenchidas:

Nome
E-mail
Telefone
CRM
Especialidade (Ortopedia, Cardiologia, Ginecologia ou Dermatologia)
Endereço completo (logradouro, número, complemento, bairro, cidade, UF e CEP)
Todas as informações são de preenchimento obrigatório, exceto o número e o complemento do endereço.

Listagem:

Descrição
O sistema deve possuir uma funcionalidade de listagem de médicos, na qual as seguintes informações, de cada um dos médicos cadastrados, deverão ser exibidas:

Nome
E-mail
CRM
Especialidade
A listagem deve ser ordenada pelo nome do médico, de maneira crescente, bem como ser paginada, trazendo 10 registros por página.

Atualização:


Descrição
O sistema deve possuir uma funcionalidade de atualização de dados cadastrais de médicos, na qual as seguintes informações poderão ser atualizadas:

Nome
Telefone
Endereço
As seguintes regras de negócio devem ser validadas pelo sistema:

Não permitir a alteração do e-mail do médico;
Não permitir a alteração do CRM do médico;
Não permitir a alteração da Especialidade do médico.


Exclusão:

Descrição
O sistema deve possuir uma funcionalidade que permita a exclusão de médicos cadastrados.

As seguintes regras de negócio devem ser validadas pelo sistema:

A exclusão não deve apagar os dados do médico, mas torná-lo como "inativo" no sistema.

O sistema deve possuir uma funcionalidade que permita o agendamento de consultas, na qual as seguintes informações deverão ser preenchidas:

Paciente
Médico
Data/Hora da consulta
As seguintes regras de negócio devem ser validadas pelo sistema:

O horário de funcionamento da clínica é de segunda a sábado, das 07:00 às 19:00;
As consultas tem duração fixa de 1 hora;
As consultas devem ser agendadas com antecedência mínima de 30 minutos;
Não permitir o agendamento de consultas com pacientes inativos no sistema;
Não permitir o agendamento de consultas com médicos inativos no sistema;
Não permitir o agendamento de mais de uma consulta no mesmo dia para um mesmo paciente;
Não permitir o agendamento de uma consulta com um médico que já possui outra consulta agendada na mesma data/hora;
A escolha do médico é opcional, sendo que nesse caso o sistema deve escolher aleatoriamente algum médico disponível na data/hora preenchida.

O sistema deve possuir uma funcionalidade que permita o cancelamento de consultas, na qual as seguintes informações deverão ser preenchidas:

Consulta
Motivo do cancelamento
As seguintes regras de negócio devem ser validadas pelo sistema:

É obrigatório informar o motivo do cancelamento da consulta, dentre as opções: paciente desistiu, médico cancelou ou outros;
Uma consulta somente poderá ser cancelada com antecedência mínima de 24 horas.

## Link Para Testes no Postman

https://drive.google.com/file/d/1q3tvxm8JOHKejbnI59WEGEtRd4oGxHgI/view?usp=drive_link

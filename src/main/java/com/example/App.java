// Use o padrão Singleton
//• Faça com que a classe em si seja responsável pela
//criação e manutenção da sua instância única



/* Deve haver uma única instância de uma classe e
esta instância deve ser acessada a partir de um
ponto de acesso bem-conhecido
SINGLETON */



/*• Como garantir uma instância única?

–Não permitir chamadas ao construtor

–Construtor private

–A classe possui um objeto (static) dela mesma. */



/*Singleton

– Define uma operação getInstance() que permite que
clientes acessem sua instância única

• É um método estático
– permite acesso sem que seja necessário criar a classe na qual
este se encontra

– Deve ser responsável pela criação de sua instância
única */



/*PARTICIPANTES

• Clientes acessam a instância apenas através da
operação getInstance() do Singleton

– O que é um cliente?

– Sempre que quiserem uma instância da classe podem
obtê-la a partir da chamada ao métodos getInstance()

– Por se tratar de um método estático, a chamada ao mesmo
se dá:
• NomeDaClasse.nomeDoMetodo() */


/*
COLABORAÇÕES

• Acesso controlado à instância única
– O singleton tem controle sobre como e quando clientes
acessam a instância

• Permite refinamento de operações e de
representação
– Várias classes Singleton podem obedecer a mesma
interface, permitindo que um singleton particular seja
escolhido para trabalhar com uma determinada aplicação
em tempo de execução
 */


 /*CONSEQUÊNCIAS

• Permite a existência de um número variável de
instâncias
– É fácil fazer com que o Singleton crie um número fixo, ou
um número máximo de instâncias em vez de apenas uma
única instância

*/
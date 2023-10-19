package simulado_q1;

import java.time.LocalDate;


/**
 * Questão 1.
 * 
 * Crie classes para representar dados sobre uma base de usuários (UserBase) do Twitter, seguindo o diagrama UML fornecido.
 * 
 * Implemente funcionalidade nas suas classes para calcular a porcentagem de usuários "verificados" (VerifiedUser) 
 * em uma UserBase assim como o tamanho médio de cada mensagem (ou seja o tamanho médio do atributo text de 
 * todos os tweets de todos os usuários).
 * 
 * Crie um testador para suas classes. 
 * 
 * 
 */


public class TestadorQ1 {

	public static void main(String[] args) {
		
		Tweet t1 = new Tweet("Alerta Ragnarok Landverse: Nostalgia MMORPG encontra inovação WEB3! Participe da diversão");
		Tweet t2 = new Tweet("essa é simplesmente a PIOR ideia que eu já vi");
		Tweet t3 = new Tweet("esse tt não é meu");
		Tweet t4 = new Tweet("Informando tudo sobre os bastidores do mundo do futebol. Publicidade/parceria:Ative as notificações.");
		Tweet t5 = new Tweet("Estamos um pouco envergonhados de admitir que só agora descobrimos esses detalhes ocultos geniais.");


		User user1 = new User( "user1", "000");
		User user2 = new User( "user2", "111");
		User user3 = new User( "user3", "222");

		user1.addTweet(t1);
		user2.addTweet(t2);
		user3.addTweet(t3);
		user1.addTweet(t4);
		user2.addTweet(t5);
		
		LocalDate data =  LocalDate.now();

		VerifiedUser user4 = new VerifiedUser("user4", "333", data);
		VerifiedUser user5 = new VerifiedUser("user5", "444", data);
		VerifiedUser user6 = new VerifiedUser("user6", "555", data);

		UserBase base = new UserBase();

		base.addUsuario(user1);
		base.addUsuario(user2);
		base.addUsuario(user3);
		base.addUsuario(user4);
		base.addUsuario(user5);
		base.addUsuario(user6);

		System.out.println("Media de tweets: " + base.calculaMediaTweets());
		System.out.println("Porcentagem usuarios verificados: " + base.porcentagemUserVerificados());
	}

}

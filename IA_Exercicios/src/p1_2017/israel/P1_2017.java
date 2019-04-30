package p1_2017.israel;

public class P1_2017 {

	/*
	 * 1) C=Cognitivo; R=Puramente Reativo; A=Ambos
	 * 
	 * a)( C ) 
	 * b)( A ) 
	 * c)( C )
	 * d)( C ) 
	 * e)( A )
	 * f)( C ) 
	 * g)( R ) 
	 * h)( R ) 
	 * i)( C )
	 * j)( R )
	 */

	/*
	 * 2) Sobre Algoritmos, V=Verdadeiro; F=Falso
	 * 
	 * a) (V) O A* pode atingir a solução ótima quando a busca é em árvore e as
	 * funções heurísticas usadas por ele são admissiveis. 
	 * 
	 * b) (V) Algoritmos de busca com informação são recomendados quando o espaço
	 *  de busca é muito grande. 
	 *  
	 * c) (F) O Hill Climbing constroi uma árvore de busca para encontrar a
	 * solução, escolhendo em amplitude o melhor estado sucessor. 
	 * 
	 * d) (V) O Simulated Anneling, diferente do Hill Climbing, possui um mecanismo
	 * de perturbação da solução que procura evitar máximos (ou mínimos) locais. 
	 * 
	 * e) (F) O algoritmo genético escolhe o estado vizinho sucessor aleatoriamente.
	 */
	
	/*
	 * 3) Problema dos casais
	 * ---
	 * Eu escolheria fazer o algoritmo com o Genético. Representando os índices dos
	 * cromossomos (arrays de genes/inteiros) como mulheres, e cada gene binário
	 * como identificador dos homens, é possivel criar cromossomos de diferentes
	 * combinações e aptidões. Essa aptidão poderia ser uma função que calcula o
	 * nível de felicidade médio do pareamento dos homens e mulheres. 
	 * 
	 * Fazendo assim, e passando pela seleção, reprodução, e mutação, para garantir
	 * que haverão diferentes populações com números cada vez melhores de aptidão,
	 * é possivel atingir uma solução boa ou ótima por convergência, ou seja, aquela
	 * que apresenta a maior média de felicidade/aptidão. 	 * 
	 * ----------------------------------------------------------------------------	 * 
	 * Também seria possivel via Simulated annealing, da mesma forma que o Genético,
	 * haveria uma função heurística que calcularia o índice de felicidade do estado,
	 * ele então moveria-se para um estado superior que gerasse maior felicidade
	 * (alterando um casal que resultasse em maior ponto). Para evitar problemas de 
	 * máximo local, o simulated annealing implementaria uma chance pequena de um
	 * estado próximo piorar o estado atual. Chance essa que diminui a cada vez que
	 * ela acontece, e futuramente convergindo para um provável máximo global. 
	 * ---
	 * 
	 * 4)
	 * 		D)
	 * 
	 * 5) 
	 * Elitismo: O elitismo passa o melhor indivíduo da população atual direto para 
	 * a intermediária. É utilizado para evitar a perda do melhor indivíduo até o
	 * momento buscando melhorar a pontuação da próxima população.
	 * 
	 * Torneio: Seleciona dois indivíduos de forma randômica, e escolhe o melhor
	 * para ser o pai. Repete a operação selecionando a mãe. Tendo o indivíduo
	 * pai e mãe selecionados, estes podem ser utilizados para reproduzir filhos,
	 * executando crossover, que integrarão a população.
	 * 
	 * 6)
	 * Ação: Empurrar(X,Y)
	 * Pre.Cond: Em(Macaco, X), Em(Caixa, X), Altura(Caixa, Baixa), Altura(Macaco, Baixo)
//	 * Pos.Cond: Em(Macaco, Y), Em(Caixa, Y), ¬Em(Macaco, X), ¬Em(Caixa, X)
	 */
	public static void main(String[] args) {

	}

}

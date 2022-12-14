package com.tukks.cogito.service.internal.NLP.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created By NLP Community
 *
 * @User : Sreejith.S
 *
 * List of stop words in English language.
 */

public class StopWords {

	public static final Set<String> STOP_WORDS;

	static {
		String[] elements = {"a's", "able", "about", "above", "according", "accordingly", "across", "actually",
			"after", "afterwards", "again", "against", "ain't", "ain", "all", "allow", "allows", "almost", "alone",
			"along", "already", "also", "although", "always", "am", "among", "amongst", "an", "and", "another",
			"any", "anybody", "anyhow", "anyone", "anything", "anyway", "anyways", "anywhere", "apart", "appear",
			"appreciate", "appropriate", "are", "aren't", "aren", "around", "as", "aside", "ask", "asking", "associated",
			"at", "available", "away", "awfully", "be", "became", "because", "become", "becomes", "becoming",
			"been", "before", "beforehand", "behind", "being", "believe", "below", "beside", "besides", "best",
			"better", "between", "beyond", "both", "brief", "but", "by", "c", "c'mon", "c's", "came", "campaign", "can",
			"can't", "cannot", "cant", "cause", "causes", "certain", "certainly", "changes", "clearly", "co",
			"com", "come", "comes", "concerning", "consequently", "consider", "considering", "contain",
			"containing", "contains", "corresponding", "could", "couldn't", "couldn", "course", "currently",
			"definitely", "described", "despite", "did", "didn't", "didn", "different", "do", "does", "doesn't", "doesn", "doing",
			"don't", "done", "down", "downwards", "during", "each", "edu", "eight", "either", "else",
			"elsewhere", "enough", "endorsed", "entirely", "especially", "et", "etc", "even", "ever", "every", "everybody",
			"everyone", "everything", "everywhere", "ex", "exactly", "example", "except", "far", "few",
			"fifth", "first", "financial", "five", "followed", "following", "follows", "for", "former", "formerly", "forth",
			"four", "from", "further", "furthermore", "get", "gets", "getting", "given", "gives", "go",
			"goes", "going", "gone", "got", "gotten", "greetings", "had", "hadn't", "hadn", "happens", "hardly",
			"has", "hasn't", "hasn", "have", "haven't", "haven", "having", "he", "he's", "hello", "help", "hence", "her", "here",
			"here's", "hereafter", "hereby", "herein", "hereupon", "hers", "herself", "hi", "him", "himself",
			"his", "hither", "hopefully", "how", "howbeit", "however", "i'd", "i'll", "i'm", "i've", "ie",
			"if", "ignored", "immediate", "in", "inasmuch", "inc", "indeed", "indicate", "indicated", "indicates",
			"inner", "insofar", "instead", "into", "inward", "is", "isn't", "isn", "it", "it'd", "it'll", "it's", "its",
			"itself", "just", "keep", "keeps", "kept", "know", "knows", "known", "last", "lately",
			"later", "latter", "latterly", "least", "less", "lest", "let", "let's", "like", "liked", "likely",
			"little", "look", "looking", "looks", "ltd", "mainly", "many", "may", "maybe", "me", "mean",
			"meanwhile", "merely", "might", "more", "moreover", "most", "mostly", "much", "must", "my", "myself",
			"name", "namely", "nd", "near", "nearly", "necessary", "need", "needs", "neither", "never",
			"nevertheless", "new", "next", "nine", "no", "nobody", "non", "none", "noone", "nor", "normally",
			"not", "nothing", "novel", "now", "nowhere", "obviously", "of", "off", "often", "oh", "ok",
			"okay", "old", "on", "once", "one", "ones", "only", "onto", "or", "other", "others", "otherwise",
			"ought", "our", "ours", "ourselves", "out", "outside", "over", "overall", "own", "particular",
			"particularly", "per", "perhaps", "placed", "please", "plus", "possible", "presumably", "probably",
			"provides", "quite", "quote", "quarterly", "rather", "really", "reasonably", "regarding",
			"regardless", "regards", "relatively", "respectively", "right", "said", "same", "saw", "say",
			"saying", "says", "second", "secondly", "see", "seeing", "seem", "seemed", "seeming", "seems", "seen",
			"self", "selves", "sensible", "sent", "serious", "seriously", "seven", "several", "shall", "she",
			"should", "shouldn't", "shouldn", "since", "six", "so", "some", "somebody", "somehow", "someone", "something",
			"sometime", "sometimes", "somewhat", "somewhere", "soon", "sorry", "specified", "specify",
			"specifying", "still", "sub", "such", "sup", "sure", "t's", "take", "taken", "tell", "tends",
			"than", "thank", "thanks", "thanx", "that", "that's", "thats", "the", "their", "theirs", "them",
			"themselves", "then", "thence", "there", "there's", "thereafter", "thereby", "therefore", "therein",
			"theres", "thereupon", "these", "they", "they'd", "they'll", "they're", "they've", "think", "third",
			"this", "thorough", "thoroughly", "those", "though", "three", "through", "throughout", "thru", "thus",
			"to", "together", "too", "took", "toward", "towards", "tried", "tries", "truly", "try", "trying",
			"twice", "two", "under", "unfortunately", "unless", "unlikely", "until", "unto", "up",
			"upon", "us", "use", "used", "useful", "uses", "using", "usually", "uucp", "value", "various",
			"very", "via", "viz", "vs", "want", "wants", "was", "wasn't", "wasn", "way", "we", "we'd", "we'll",
			"we're", "we've", "welcome", "well", "went", "were", "weren't", "weren", "what", "what's", "whatever", "when",
			"whence", "whenever", "where", "where's", "whereafter", "whereas", "whereby", "wherein", "whereupon",
			"wherever", "whether", "which", "while", "whither", "who", "who's", "whoever", "whole", "whom",
			"whose", "why", "will", "willing", "wish", "with", "within", "without", "won't", "won", "wonder", "would",
			"would", "wouldn't", "wouldn", "yes", "yet", "you", "you'd", "you'll", "you're", "you've", "your",
			"yours", "yourself", "yourselves", "zero", "official", "sharply", "criticized", "a",
			"??", "??", "abord", "afin", "ah", "ai", "aie", "ainsi",
			"allaient", "allo", "all??", "allons", "apr??s", "assez", "attendu", "au", "aucun", "aucune", "aujourd", "aujourd'hui", "auquel", "aura", "auront",
			"aussi", "autre", "autres", "aux", "auxquelles", "auxquels", "avaient", "avais", "avait", "avant", "avec", "avoir", "ayant", "b", "bah", "beaucoup",
			"bien", "bigre", "boum", "bravo", "brrr", "c", "??a", "car", "ce", "ceci", "cela", "celle", "celle-ci", "celle-l??", "celles", "celles-ci",
			"celles-l??", "celui", "celui-ci", "celui-l??", "cent", "cependant", "certain", "certaine", "certaines", "certains", "certes", "ces", "cet", "cette",
			"ceux", "ceux-ci", "ceux-l??", "chacun", "chaque", "cher", "ch??re", "ch??res", "chers", "chez", "chiche", "chut", "ci", "cinq", "cinquantaine",
			"cinquante", "cinquanti??me", "cinqui??me", "clac", "clic", "combien", "comme", "comment", "compris", "concernant", "contre", "couic", "crac", "d",
			"da", "dans", "de", "debout", "dedans", "dehors", "del??", "depuis", "derri??re", "des", "d??s", "d??sormais", "desquelles", "desquels", "dessous",
			"dessus", "deux", "deuxi??me", "deuxi??mement", "devant", "devers", "devra", "diff??rent", "diff??rente", "diff??rentes", "diff??rents", "dire", "divers",
			"diverse", "diverses", "dix", "dix-huit", "dixi??me", "dix-neuf", "dix-sept", "doit", "doivent", "donc", "dont", "douze", "douzi??me", "dring", "du",
			"duquel", "durant", "e", "effet", "eh", "elle", "elle-m??me", "elles", "elles-m??mes", "en", "encore", "entre", "envers", "environ", "es", "??s",
			"est", "et", "etant", "??taient", "??tais", "??tait", "??tant", "etc", "??t??", "etre", "??tre", "eu", "euh", "eux", "eux-m??mes", "except??", "f", "fa??on",
			"fais", "faisaient", "faisant", "fait", "feront", "fi", "flac", "floc", "font", "g", "gens", "h", "ha", "h??", "hein", "h??las", "hem", "hep", "hi",
			"ho", "hol??", "hop", "hormis", "hors", "hou", "houp", "hue", "hui", "huit", "huiti??me", "hum", "hurrah", "i", "il", "ils", "importe", "j", "je",
			"jusqu", "jusque", "k", "l", "la", "l??", "laquelle", "las", "le", "lequel", "les", "l??s", "lesquelles", "lesquels", "leur", "leurs", "longtemps",
			"lorsque", "lui", "lui-m??me", "m", "ma", "maint", "mais", "malgr??", "me", "m??me", "m??mes", "merci", "mes", "mien", "mienne", "miennes", "miens",
			"mille", "mince", "moi", "moi-m??me", "moins", "mon", "moyennant", "n", "na", "ne", "n??anmoins", "neuf", "neuvi??me", "ni", "nombreuses", "nombreux",
			"non", "nos", "notre", "n??tre", "n??tres", "nous", "nous-m??mes", "nul", "o", "o|", "??", "oh", "oh??", "ol??", "oll??", "on", "ont", "onze", "onzi??me",
			"ore", "ou", "o??", "ouf", "ouias", "oust", "ouste", "outre", "p", "paf", "pan", "par", "parmi", "partant", "particulier", "particuli??re",
			"particuli??rement", "pas", "pass??", "pendant", "personne", "peu", "peut", "peuvent", "peux", "pff", "pfft", "pfut", "pif", "plein", "plouf", "plus",
			"plusieurs", "plut??t", "pouah", "pour", "pourquoi", "premier", "premi??re", "premi??rement", "pr??s", "proche", "psitt", "puisque", "q", "qu", "quand",
			"quant", "quanta", "quant-??-soi", "quarante", "quatorze", "quatre", "quatre-vingt", "quatri??me", "quatri??mement", "que", "quel", "quelconque",
			"quelle", "quelles", "quelque", "quelques", "quelqu'un", "quels", "qui", "quiconque", "quinze", "quoi", "quoique", "r", "revoici", "revoil??",
			"rien", "s", "sa", "sacrebleu", "sans", "sapristi", "sauf", "se", "seize", "selon", "sept", "septi??me", "sera", "seront", "ses", "si", "sien",
			"sienne", "siennes", "siens", "sinon", "six", "sixi??me", "soi", "soi-m??me", "soit", "soixante", "son", "sont", "sous", "stop", "suis", "suivant",
			"sur", "surtout", "t", "ta", "tac", "tant", "te", "t??", "tel", "telle", "tellement", "telles", "tels", "tenant", "tes", "tic", "tien", "tienne",
			"tiennes", "tiens", "toc", "toi", "toi-m??me", "ton", "touchant", "toujours", "tous", "tout", "toute", "toutes", "treize", "trente", "tr??s", "trois",
			"troisi??me", "troisi??mement", "trop", "tsoin", "tsouin", "tu", "u", "un", "une", "unes", "uns", "v", "va", "vais", "vas", "v??", "vers", "via",
			"vif", "vifs", "vingt", "vivat", "vive", "vives", "vlan", "voici", "voil??", "vont", "vos", "votre", "v??tre", "v??tres", "vous", "vous-m??mes", "vu",
			"w", "x", "y", "z", "zut", "alors", "aucuns", "bon", "devrait", "dos", "droite", "d??but", "essai", "faites", "fois", "force", "haut", "ici",
			"juste", "maintenant", "mine", "mot", "nomm??s", "nouveaux", "parce", "parole", "personnes", "pi??ce", "plupart", "seulement", "soyez", "sujet",
			"tandis", "valeur", "voie", "voient", "??tat", "??tions"};
		STOP_WORDS = Collections.unmodifiableSet(new HashSet<String>(Arrays.asList(elements)));
	}

	public Set<String> getStopWords() {
		return STOP_WORDS;
	}

}
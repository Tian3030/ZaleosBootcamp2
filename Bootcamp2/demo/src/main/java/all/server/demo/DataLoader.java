package all.server.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import all.server.demo.repositories.*;
import all.server.demo.restobjets.Comment;
import all.server.demo.restobjets.Post;
import all.server.demo.restobjets.User;

@Component
public class DataLoader {

    private UserRepository userRepository;
    private PostRepository postRepository;
    private CommentRepository commentRepository;

    @Autowired
    public DataLoader(UserRepository userRepository, PostRepository postRepository, CommentRepository commentRepository) {
        this.userRepository = userRepository;
        this.postRepository=postRepository;
        this.commentRepository = commentRepository;
        LoadUsers();
    }

    private void LoadUsers() {

        //USER GENERATION
        userRepository.save(new User("yaGOD", "YagoGamer", "Me gusta el hardware y el opensource"));
        userRepository.save(new User("juanP90", "Juan Pérez", "Apasionado por la tecnología y los videojuegos."));
        userRepository.save(new User("mariaG23", "María Gómez", "Amo la fotografía y los viajes."));
        userRepository.save(new User("carlosG07", "Carlos García", "Entusiasta del software libre y la programación."));
        userRepository.save(new User("luciF_87", "Lucía Fernández", "Cocinera aficionada y amante de los gatos."));
        userRepository.save(new User("anaTorres", "Ana Torres", "Diseñadora gráfica y soñadora de mundos."));
        userRepository.save(new User("pedroL_99", "Pedro López", "Amante del senderismo y la naturaleza."));
        userRepository.save(new User("sofiaR10", "Sofía Ramírez", "Siempre en busca de nuevas historias para leer."));
        userRepository.save(new User("diegoMdz", "Diego Méndez", "El deporte es mi estilo de vida."));
        userRepository.save(new User("elenaRojas", "Elena Rojas", "Artista en formación, me encanta pintar."));
        userRepository.save(new User("fernandoC", "Fernando Castillo", "Músico aficionado y programador autodidacta."));
        userRepository.save(new User("aliciaMora", "Alicia Morales", "Me encanta la ciencia y los documentales."));
        userRepository.save(new User("raulQ92", "Raúl Quintana", "Aventurero y fotógrafo de paisajes."));
        userRepository.save(new User("lauraB87", "Laura Bustos", "Amante del café y los buenos libros."));
        userRepository.save(new User("jorgeVel", "Jorge Velázquez", "Ingeniero de software y fan de la ciencia ficción."));
        userRepository.save(new User("daniMart", "Daniel Martínez", "Me gusta la música electrónica y el diseño web."));
        userRepository.save(new User("nataliaR", "Natalia Ríos", "Apasionada por la moda y el emprendimiento."));
        userRepository.save(new User("oscarG_77", "Óscar Gutiérrez", "Programador full stack y gamer en mis ratos libres."));
        userRepository.save(new User("claudiaS", "Claudia Suárez", "Adoro la cocina y probar recetas nuevas."));
        userRepository.save(new User("marioLop", "Mario López", "Creador de contenido y fan del cine clásico."));
        userRepository.save(new User("andreaC", "Andrea Contreras", "Siempre buscando nuevas oportunidades de aprendizaje."));
        userRepository.save(new User("pabloFz", "Pablo Fernández", "Cineasta aficionado y apasionado de la fotografía."));
        userRepository.save(new User("monicaH", "Mónica Herrera", "Me encanta la literatura de misterio."));
        userRepository.save(new User("gustavoT", "Gustavo Torres", "Programador backend y amante del rock clásico."));
        userRepository.save(new User("evaNunez", "Eva Núñez", "Diseñadora UX/UI con pasión por los detalles."));
        userRepository.save(new User("rubenG_89", "Rubén González", "Físico teórico y entusiasta de la astronomía."));
        userRepository.save(new User("beatrizM", "Beatriz Mendoza", "Adoro la jardinería y el DIY."));
        userRepository.save(new User("sergioB", "Sergio Bravo", "Fotógrafo de eventos y explorador urbano."));
        userRepository.save(new User("valeriaC", "Valeria Castro", "Viajera empedernida y escritora de blog."));
        userRepository.save(new User("robertoZ", "Roberto Zamora", "Ingeniero de datos y amante del ajedrez."));
        userRepository.save(new User("karlaHern", "Karla Hernández", "Creadora de contenido sobre moda y estilo."));
        userRepository.save(new User("joaquinM", "Joaquín Muñoz", "Fanático de la tecnología y las startups."));
        userRepository.save(new User("patriciaS", "Patricia Silva", "Profesora de historia y apasionada de los museos."));
        userRepository.save(new User("alejandroQ", "Alejandro Quintero", "Futbolista amateur y gamer en mis ratos libres."));
        userRepository.save(new User("renataO", "Renata Ortega", "Cineasta independiente y guionista novel."));
        userRepository.save(new User("hugoVarela", "Hugo Varela", "Me gusta la edición de video y la fotografía."));
        userRepository.save(new User("fabiolaR", "Fabiola Rivas", "Diseñadora de interiores y fan de la arquitectura."));
        userRepository.save(new User("matiasM", "Matías Moreno", "Entusiasta de la IA y la ciencia de datos."));
        userRepository.save(new User("gloriaF", "Gloria Fernández", "Escritora de cuentos y amante del café."));
        userRepository.save(new User("edgarT", "Edgar Torres", "Apasionado por la robótica y la automatización."));
        userRepository.save(new User("valentinP", "Valentín Pérez", "Músico de jazz y coleccionista de vinilos."));
        userRepository.save(new User("silviaA", "Silvia Aguirre", "Diseñadora de moda y emprendedora."));
        userRepository.save(new User("raulM_80", "Raúl Méndez", "Tatuador y fan del arte callejero."));
        userRepository.save(new User("gabyDuarte", "Gabriela Duarte", "Redactora de contenido y lectora compulsiva."));
        userRepository.save(new User("carmenZ", "Carmen Zúñiga", "Fotógrafa de bodas y eventos."));
        userRepository.save(new User("lucasFz", "Lucas Fernández", "Amante de los autos y la mecánica."));
        userRepository.save(new User("barbaraH", "Bárbara Herrera", "Fan del anime y la cultura japonesa."));
        userRepository.save(new User("hernanS", "Hernán Sánchez", "Ingeniero de redes y amante de la ciberseguridad."));
        userRepository.save(new User("estebanL", "Esteban León", "Creador de videojuegos y programador indie."));
        userRepository.save(new User("danielaO", "Daniela Ocampo", "Amo la danza y el teatro."));
        userRepository.save(new User("kevinMtz", "Kevin Martínez", "Cineasta y editor de video profesional."));
        userRepository.save(new User("lilianT", "Lilian Torres", "Bailarina y coreógrafa."));
        userRepository.save(new User("adrianQ", "Adrián Quintana", "Emprendedor digital y fan del marketing."));
        userRepository.save(new User("celiaH", "Celia Hernández", "Pintora y escultora en mis tiempos libres."));
        userRepository.save(new User("felipeC", "Felipe Castillo", "Locutor de radio y podcaster."));
        userRepository.save(new User("victorS", "Víctor Sánchez", "Gamer y desarrollador de software."));
        userRepository.save(new User("nicolasG", "Nicolás Gálvez", "Amante de la astronomía y la ciencia ficción."));
        userRepository.save(new User("tamaraP", "Tamara Pérez", "Estudiante de medicina y fotógrafa amateur."));
        userRepository.save(new User("brunoM", "Bruno Mendoza", "Fan de los videojuegos y coleccionista de figuras."));
        userRepository.save(new User("delfinaR", "Delfina Ramírez", "Diseñadora de personajes y fan del manga."));
        userRepository.save(new User("leoB", "León Bustos", "Escritor y aficionado a la poesía."));
        userRepository.save(new User("marinaL", "Marina López", "Amante del cine y la fotografía nocturna."));
        userRepository.save(new User("gastonV", "Gastón Vega", "Ingeniero de software y gamer competitivo."));
        userRepository.save(new User("isabelaM", "Isabela Méndez", "Me encanta la música clásica y el teatro."));
        userRepository.save(new User("ricardoF", "Ricardo Fernández", "Científico de datos y fan del ajedrez."));
        userRepository.save(new User("paulaZ", "Paula Zambrano", "Ilustradora digital y amante de los cómics."));
        userRepository.save(new User("ramiroQ", "Ramiro Quintana", "Piloto aficionado y explorador de rutas."));
        userRepository.save(new User("taniaS", "Tania Silva", "Diseñadora web y fotógrafa de paisajes urbanos."));
        userRepository.save(new User("maximilianoR", "Maximiliano Rodríguez", "Programador de videojuegos indie."));
        userRepository.save(new User("camilaT", "Camila Torres", "Apasionada por la escritura y la literatura fantástica."));
        userRepository.save(new User("francoC", "Franco Castillo", "Músico autodidacta y creador de contenido."));
        userRepository.save(new User("julietaA", "Julieta Álvarez", "Productora de contenido y fan del yoga."));
        userRepository.save(new User("ignacioM", "Ignacio Muñoz", "Desarrollador backend y entusiasta de la ciberseguridad."));
        userRepository.save(new User("solG", "Sol González", "Amo la moda, el arte y el diseño."));
        userRepository.save(new User("martinL", "Martín Luna", "Biólogo marino y amante de los océanos."));
        userRepository.save(new User("valentinaH", "Valentina Herrera", "Creadora de blogs y aficionada a la fotografía."));
        userRepository.save(new User("estebanP", "Esteban Pérez", "Entusiasta del cine de culto y la edición de video."));
        userRepository.save(new User("nereaC", "Nerea Contreras", "Me encanta la naturaleza y la vida sostenible."));
        userRepository.save(new User("santiagoQ", "Santiago Quintana", "Gamer de corazón y programador de IA."));
        userRepository.save(new User("giselaR", "Gisela Ramírez", "Tatuadora y amante del arte en todas sus formas."));
        userRepository.save(new User("alejoV", "Alejandro Vargas", "Mecánico automotriz y fan de las motocicletas."));
        userRepository.save(new User("belenF", "Belén Fernández", "Diseñadora de modas y emprendedora creativa."));
        userRepository.save(new User("federicoM", "Federico Méndez", "Desarrollador móvil y entusiasta del open-source."));
        userRepository.save(new User("mirandaS", "Miranda Suárez", "Fan de la lectura y los viajes culturales."));
        userRepository.save(new User("gabrielT", "Gabriel Torres", "Ingeniero electrónico y apasionado por la robótica."));
        userRepository.save(new User("antonellaZ", "Antonella Zúñiga", "Diseñadora de interiores y fotógrafa ocasional."));
        userRepository.save(new User("emanuelP", "Emanuel Pérez", "Escritor de cuentos y novelas de ciencia ficción."));
        userRepository.save(new User("carlaH", "Carla Hernández", "Me encanta la música alternativa y los festivales."));
        userRepository.save(new User("victoriaC", "Victoria Castro", "Apasionada por la danza contemporánea y el arte visual."));
        userRepository.save(new User("joelF", "Joel Fernández", "Ingeniero industrial y fan de la eficiencia energética."));
        userRepository.save(new User("serenaL", "Serena López", "Bailarina de ballet y amante del cine clásico."));
        userRepository.save(new User("danielQ", "Daniel Quintana", "Desarrollador frontend y diseñador UI/UX."));
        userRepository.save(new User("mariaJ", "María Jiménez", "Fan de los animales y voluntaria en refugios."));
        userRepository.save(new User("agustinT", "Agustín Torres", "Creador de podcasts y entusiasta de la filosofía."));
        userRepository.save(new User("roxanaP", "Roxana Pérez", "Me encanta la jardinería y la sostenibilidad."));
        userRepository.save(new User("felipeG", "Felipe Gutiérrez", "Ingeniero aeroespacial y fan de la exploración espacial."));
        userRepository.save(new User("antonioC", "Antonio Castillo", "Piloto de drones y creador de contenido visual."));
        userRepository.save(new User("lourdesM", "Lourdes Morales", "Periodista y apasionada por la comunicación."));
        userRepository.save(new User("sebastianL", "Sebastián López", "Amo la inteligencia artificial y la automatización."));
        userRepository.save(new User("florenciaZ", "Florencia Zamora", "Diseñadora gráfica y aficionada a la fotografía."));
        userRepository.save(new User("cristianF", "Cristian Fernández", "Entrenador personal y motivador."));
        userRepository.save(new User("biancaT", "Bianca Torres", "Creadora de contenido de viajes y aventura."));
        userRepository.save(new User("mauroR", "Mauro Ramírez", "Estudiante de astronomía y explorador del cosmos."));
        userRepository.save(new User("pamelaH", "Pamela Herrera", "Apasionada por el diseño de interiores y la decoración."));
        userRepository.save(new User("facundoM", "Facundo Muñoz", "Ingeniero mecánico y amante de la velocidad."));
        userRepository.save(new User("elisaS", "Elisa Suárez", "Bióloga y exploradora de ecosistemas naturales."));
        userRepository.save(new User("jonathanP", "Jonathan Pérez", "Programador blockchain y entusiasta de las criptomonedas."));
        userRepository.save(new User("celesteC", "Celeste Castro", "Artista digital y fan del arte conceptual."));
        userRepository.save(new User("matiasV", "Matías Vega", "Deportista y entrenador de alto rendimiento."));

        //POST GENERATION
        postRepository.save(new Post("yaGOD", "Me encanta el nuevo gadget de tecnología, ¿alguien más lo tiene?", 50, 10));
        postRepository.save(new Post("juanP90", "¡Hoy estuve en una exposición de fotografía increíble!", 75, 20));
        postRepository.save(new Post("mariaG23", "Acabo de terminar de leer un libro sobre inteligencia artificial, ¡muy recomendable!", 100, 30));
        postRepository.save(new Post("carlosG07", "La naturaleza es un lugar tan mágico para hacer senderismo, ¡me encanta!", 80, 25));
        postRepository.save(new Post("luciF_87", "Hoy estuve practicando nuevos platillos en la cocina, ¡definitivamente lo haré más seguido!", 60, 15));
        postRepository.save(new Post("anaTorres", "Diseñé un logo para una marca local, ¡me siento tan orgullosa del resultado!", 120, 40));
        postRepository.save(new Post("pedroL_99", "¡Increíble partido de fútbol hoy, uno de los mejores partidos de la temporada!", 90, 35));
        postRepository.save(new Post("sofiaR10", "No puedo esperar para ver la nueva película de ciencia ficción que sale este fin de semana", 110, 50));
        postRepository.save(new Post("diegoMdz", "¡Acabo de hacer mi primer tatuaje! Estoy tan feliz con el resultado", 130, 60));
        postRepository.save(new Post("elenaRojas", "El diseño de interiores de mi casa está quedando espectacular, ¡estoy muy contenta!", 70, 20));
        postRepository.save(new Post("fernandoC", "Hoy empecé a aprender a tocar piano, ¡un paso más en mi camino musical!", 95, 45));
        postRepository.save(new Post("aliciaMora", "¿Alguien más tiene una colección de videojuegos retro? ¡Yo no puedo dejar de coleccionarlos!", 85, 10));
        postRepository.save(new Post("raulQ92", "He estado trabajando en un proyecto de ciencia de datos, ¡es tan emocionante ver los resultados!", 140, 30));
        postRepository.save(new Post("lauraB87", "¡No hay nada como la música electrónica para comenzar bien el día!", 110, 55));
        postRepository.save(new Post("jorgeVel", "Estoy escribiendo una nueva historia de ciencia ficción, ¿alguien tiene recomendaciones para inspirarme?", 125, 45));
        postRepository.save(new Post("daniMart", "Hoy estuve explorando una nueva ruta para hacer senderismo, ¡espectacular!", 95, 25));
        postRepository.save(new Post("nataliaR", "¡Me encantan las películas de terror! ¿Alguien tiene alguna recomendación?", 80, 15));
        postRepository.save(new Post("oscarG_77", "Estuve aprendiendo sobre arquitectura moderna, ¡es un tema fascinante!", 105, 40));
        postRepository.save(new Post("claudiaS", "Hice una receta nueva para postres hoy, ¡quedó deliciosa!", 55, 10));
        postRepository.save(new Post("marioLop", "Siempre he sido un gran fan de la fotografía nocturna, ¡es un desafío divertido!", 90, 20));
        postRepository.save(new Post("andreaC", "Finalmente terminé de escribir mi primer guion de cine, ¡estoy muy emocionado por mostrarlo!", 130, 60));
        postRepository.save(new Post("pabloFz", "El cine clásico siempre tendrá un lugar especial en mi corazón, ¿cuál es tu película favorita?", 120, 50));
        postRepository.save(new Post("monicaH", "Hoy aprendí un montón sobre ciberseguridad, ¡es un campo increíble!", 100, 30));
        postRepository.save(new Post("gustavoT", "Estoy escribiendo un artículo sobre tecnología y me gustaría saber sus opiniones", 110, 40));
        postRepository.save(new Post("evaNunez", "Me encanta la moda y el arte, ¿algún consejo para combinar estilos?", 95, 25));
        postRepository.save(new Post("rubenG_89", "Este año empiezo un nuevo proyecto sobre IA y machine learning, ¡estoy emocionado!", 130, 50));
        postRepository.save(new Post("beatrizM", "Me encanta la jardinería y hoy planté algunas flores, ¡es tan relajante!", 80, 30));
        postRepository.save(new Post("sergioB", "Fotografiar bodas es uno de mis mayores placeres, ¡qué experiencia tan especial!", 100, 35));
        postRepository.save(new Post("valeriaC", "Hoy hice una caminata por la ciudad y descubrí nuevos rincones, ¡me encanta explorar!", 90, 20));
        postRepository.save(new Post("robertoZ", "Trabajo en un nuevo proyecto de datos, ¡esperamos hacer cosas muy interesantes!", 110, 60));
        postRepository.save(new Post("karlaHern", "Estoy creando contenido sobre moda, ¡me encantaría saber qué piensan de mis outfits!", 120, 50));
        postRepository.save(new Post("joaquinM", "Soy fanático de las startups, ¿cuáles me recomiendan?", 105, 40));
        postRepository.save(new Post("patriciaS", "Hoy estuve en el museo, ¡siempre me sorprende la historia que se guarda allí!", 80, 30));
        postRepository.save(new Post("alejandroQ", "La tecnología y el deporte son mi pasión, ¡siempre busco combinarlos!", 90, 25));        
        
        //COMMENTS CREATION
        commentRepository.save(new Comment("yaGOD", "¡Este gadget está increíble! Me gustaría tenerlo.", 1L));
        commentRepository.save(new Comment("pedroL_99", "¡Lo tengo! Es genial, ¿cómo lo usas tú?", 1L));
        commentRepository.save(new Comment("sofiaR10", "Aún no lo tengo, pero estoy pensando en comprarlo.", 1L));
        
        commentRepository.save(new Comment("mariaG23", "¡La exposición fue impresionante! ¿Qué fotos más te gustaron?", 2L));
        commentRepository.save(new Comment("daniMart", "Me encantaría ir la próxima vez. ¡Estoy buscando nuevas exposiciones!", 2L));
        
        commentRepository.save(new Comment("fernandoC", "¡Acabo de leerlo también! Muy interesante, ¿qué tema de IA te pareció más fascinante?", 3L));
        commentRepository.save(new Comment("elenaRojas", "Voy a empezar a leerlo, gracias por la recomendación.", 3L));
        commentRepository.save(new Comment("raulQ92", "Definitivamente lo leeré, ¡suena muy bien!", 3L));
        
        commentRepository.save(new Comment("jorgeVel", "¡Totalmente! La naturaleza tiene una magia especial.", 4L));
        commentRepository.save(new Comment("beatrizM", "Yo también soy fan del senderismo, ¿has visitado algún otro lugar increíble?", 4L));
        commentRepository.save(new Comment("pabloFz", "¡Me encanta la naturaleza! Este fin de semana tengo planeado hacer una ruta.", 4L));
        
        commentRepository.save(new Comment("marioLop", "¡Qué rico! Estoy seguro de que salió delicioso.", 5L));
        commentRepository.save(new Comment("estebanP", "Lo intentaré también, siempre estoy buscando nuevas recetas.", 5L));
        commentRepository.save(new Comment("andreaC", "¡Qué buena idea! Yo también quiero probarlo.", 5L));
        
        commentRepository.save(new Comment("raquelG", "¡Qué bonito el logo! Felicidades, se ve profesional.", 6L));
        commentRepository.save(new Comment("gustavoT", "Es un excelente trabajo, me encantaría saber más sobre el proceso.", 6L));
        
        commentRepository.save(new Comment("santiagoQ", "¡Qué buen partido! Fue increíble ver cómo se jugó.", 7L));
        commentRepository.save(new Comment("delfinaR", "Me gustaría ver el partido, ¿qué equipos jugaron?", 7L));
        commentRepository.save(new Comment("rubenG_89", "¡Uno de los mejores partidos de la temporada! ¿Cómo estuvo el ambiente?", 7L));
        
        commentRepository.save(new Comment("fernandoC", "¡Totalmente de acuerdo! Ya estoy esperando su estreno.", 8L));
        commentRepository.save(new Comment("claudiaS", "¡No puedo esperar! ¿De qué trata?", 8L));
        
        commentRepository.save(new Comment("elenaRojas", "¡Qué emocionante! ¿Dónde te lo hiciste?", 9L));
        commentRepository.save(new Comment("pabloFz", "El tatuaje quedó genial, ¿te animarías a mostrarlo?", 9L));
        commentRepository.save(new Comment("gustavoT", "¡Wow! El tatuaje debe ser impresionante.", 9L));
        
        commentRepository.save(new Comment("mariaG23", "¡Tu diseño es impresionante! Felicitaciones.", 10L));
        commentRepository.save(new Comment("lauraB87", "Estoy pensando en rediseñar mi sala, ¿algún consejo?", 10L));
        
        commentRepository.save(new Comment("jorgeVel", "¡Qué emocionante! El piano es un instrumento increíble.", 11L));
        commentRepository.save(new Comment("nataliaR", "Me encanta la música, ¿qué canción estás aprendiendo?", 11L));
        
        commentRepository.save(new Comment("raulQ92", "¡Qué genial! Yo también colecciono videojuegos retro.", 12L));
        commentRepository.save(new Comment("sergioB", "Tengo una colección gigante de consolas antiguas, ¡qué bueno ver a otros con la misma pasión!", 12L));
        
        commentRepository.save(new Comment("sofiaR10", "¡Qué interesante proyecto! ¿Cómo lo estás desarrollando?", 13L));
        commentRepository.save(new Comment("pedroL_99", "Me encanta todo lo relacionado con la ciencia de datos. ¿Qué has aprendido hasta ahora?", 13L));
        
        commentRepository.save(new Comment("marioLop", "¡Qué buena elección de música! También me encanta la electrónica.", 14L));
        commentRepository.save(new Comment("daniMart", "¡Siempre es un buen día con música electrónica!", 14L));
        
        commentRepository.save(new Comment("gustavoT", "¡Qué emocionante! Soy fan de la ciencia ficción, ¿algún autor que recomiendes?", 15L));
        commentRepository.save(new Comment("beatrizM", "¡Qué divertido! La ciencia ficción siempre da para buenas historias.", 15L));
        
        commentRepository.save(new Comment("raulM_80", "¡Qué increíble! ¿Qué ruta estás explorando?", 16L));
        commentRepository.save(new Comment("claudiaS", "¡Siempre es un reto encontrar nuevas rutas!", 16L));
        
        commentRepository.save(new Comment("jorgeVel", "¡Las películas de terror son lo mejor! ¿Tienes alguna recomendación?", 17L));
        commentRepository.save(new Comment("marioLop", "Me encantan las películas de terror, ¿cuál me recomiendas?", 17L));
        
        commentRepository.save(new Comment("aliciaMora", "¡La arquitectura moderna es fascinante! ¿Qué tipo de arquitectura estás aprendiendo?", 18L));
        commentRepository.save(new Comment("gustavoT", "Es un tema impresionante, ¿qué arquitectos te inspiran?", 18L));
        
        commentRepository.save(new Comment("daniMart", "¡Se ve deliciosa! ¿Qué receta usaste?", 19L));
        commentRepository.save(new Comment("jorgeVel", "¡Qué rico! Tengo que probarla también.", 19L));
        
        commentRepository.save(new Comment("lauraB87", "¡Qué desafío tan divertido! También me gusta la fotografía nocturna.", 20L));
        commentRepository.save(new Comment("pedroL_99", "¡Genial! Yo siempre he querido intentarlo.", 20L));
        
        commentRepository.save(new Comment("sofiaR10", "¡Qué increíble! ¿De qué trata el guion?", 21L));
        commentRepository.save(new Comment("gustavoT", "¡Qué emocionante! Estoy seguro de que será un éxito.", 21L));
        
        commentRepository.save(new Comment("gustavoT", "¡Las películas clásicas nunca pasarán de moda!", 22L));
        commentRepository.save(new Comment("mariaG23", "¡Totalmente! Esas películas siempre tienen algo especial.", 22L));
        
        commentRepository.save(new Comment("pedroL_99", "¡Qué interesante! La ciberseguridad es un tema clave hoy en día.", 23L));
        commentRepository.save(new Comment("nataliaR", "Definitivamente un tema muy relevante. ¿Qué aprendiste?", 23L));
        
        commentRepository.save(new Comment("sofiaR10", "¡El artículo de tecnología debe quedar increíble! ¿De qué trata?", 24L));
        commentRepository.save(new Comment("fernandoC", "¡Es una gran idea! Me encantaría leerlo.", 24L));
        
        commentRepository.save(new Comment("raquelG", "¡Me encanta la moda! ¿Tienes alguna recomendación?", 25L));
        commentRepository.save(new Comment("mariaG23", "¡Qué divertido! Estoy aprendiendo más sobre moda.", 25L));
        
        commentRepository.save(new Comment("pabloFz", "¡Qué emocionante! La IA y el machine learning siempre están avanzando.", 26L));
        commentRepository.save(new Comment("gustavoT", "Es increíble cómo la IA está cambiando todo, ¿qué enfoque tienes?", 26L));
        
        commentRepository.save(new Comment("raulQ92", "¡Me encanta la jardinería! ¿Qué plantas sembraste?", 27L));
        
        
    }


}

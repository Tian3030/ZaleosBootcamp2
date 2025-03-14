package all.server.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import all.server.demo.repositories.*;
import all.server.demo.restobjets.User;

@Component
public class DataLoader {

    private UserRepository userRepository;

    @Autowired
    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
        LoadUsers();
    }

    private void LoadUsers() {
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

    }

}

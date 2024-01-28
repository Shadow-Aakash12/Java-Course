import java.util.Scanner;

import java.util.ArrayList;

public class App {

    public static void main(String[] args){

        int choice;

        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------------");

        System.out.println("|                                             |");

        System.out.println("| These are the List of Best Movies From 2021 |");

        System.out.println("|                                             |");

        System.out.println("-----------------------------------------------");

        
        ArrayList<MovieObj> moviesList = new ArrayList<>();

        MovieObj movieObj;
    
        // Obj1
         MovieObj movieObj1 = new MovieObj();
         movieObj1.movieName = "Zack Snyder's Justice League";
         movieObj1.genre = "Action, Adventure, SuperHero";
    
         moviesList.add(movieObj1);
    
        // Obj2
         MovieObj movieObj2 = new MovieObj();
         movieObj2.movieName = "Godzilla vs Kong";
         movieObj2.genre = "Action, Kaiju, Disaster";
    
         moviesList.add(movieObj2);
    
        // Obj3
         MovieObj movieObj3 = new MovieObj();
         movieObj3.movieName = "Mortal Kombat";
         movieObj3.genre = "Action, Martial Arts, Fantasy";
    
         moviesList.add(movieObj3);
    
        // Obj4
         MovieObj movieObj4 = new MovieObj();
         movieObj4.movieName = "A Quiet Place Part II";
         movieObj4.genre = "Horror, Suspense, Crime Fiction";
    
        moviesList.add(movieObj4);
    
        // Obj5
         MovieObj movieObj5 = new MovieObj();
         movieObj5.movieName = "Shang-Chi and the Legend of the Ten Rings";
         movieObj5.genre = "Action, Martial Arts, Fantasy";
    
         moviesList.add(movieObj5);
    
        // Obj6
         MovieObj movieObj6 = new MovieObj();
         movieObj6.movieName = "Venom: Let There Be Carnage";
         movieObj6.genre = "Horror, Sci-Fiction, SuperHero";
    
        moviesList.add(movieObj6);
    
        // Obj7
         MovieObj movieObj7 = new MovieObj();
         movieObj7.movieName = "Spider-Man: No Way Home";
         movieObj7.genre = "SuperHero, Adventure, Sci-Fiction";
    
         moviesList.add(movieObj7);
    
        // Obj8
         MovieObj movieObj8 = new MovieObj();
         movieObj8.movieName = "The Suicide Squad";
         movieObj8.genre = "Crime Fiction, Science Fiction, Comedy";
    
         moviesList.add(movieObj8);
    
        // Obj9
         MovieObj movieObj9 = new MovieObj();
         movieObj9.movieName = "F9: The Fast Saga";
         movieObj9.genre = "Action, Crime Fiction, Drama";
    
         moviesList.add(movieObj9);
    
        // Obj10
         MovieObj movieObj10 = new MovieObj();
         movieObj10.movieName = "The Eternals";
         movieObj10.genre = "SuperHero, Action, Sci-Fiction";
    
         moviesList.add(movieObj10);


        //  System.out.println(moviesList);

        App app = new App();

        app.MoviesListLoop(moviesList);

        // Getting input From user to specify their fav!!


        System.out.println("Enter your Choice of the Movie : ");
        
        choice = input.nextInt();

        switch (choice) {
            case 1: 

                movieObj1.description = "Certainly! Let's take \"Zack Snyder's Justice League\" as an example:\r\n" + //
                        "\r\n" + //
                        "**Title: Zack Snyder's Justice League (2021)**\r\n" + //
                        "\r\n" + //
                        "**Short Summary:**\r\n" + //
                        "After the original release in 2017 faced mixed reviews, director Zack Snyder returned to bring his vision to life in this extended and reimagined cut of \"Justice League.\" The film follows DC Comics' iconic superheroes—Batman (Ben Affleck), Superman (Henry Cavill), Wonder Woman (Gal Gadot), Aquaman (Jason Momoa), The Flash (Ezra Miller), and Cyborg (Ray Fisher)—as they join forces to save the world from an apocalyptic threat. The extended runtime allows for a more in-depth exploration of each character's story and provides a darker and more cohesive narrative.\r\n" + //
                        "\r\n" + //
                        "**Cast:**\r\n" + //
                        "- Ben Affleck as Bruce Wayne / Batman\r\n" + //
                        "- Henry Cavill as Clark Kent / Superman\r\n" + //
                        "- Gal Gadot as Diana Prince / Wonder Woman\r\n" + //
                        "- Jason Momoa as Arthur Curry / Aquaman\r\n" + //
                        "- Ezra Miller as Barry Allen / The Flash\r\n" + //
                        "- Ray Fisher as Victor Stone / Cyborg\r\n" + //
                        "\r\n" + //
                        "The film not only showcases the epic collaboration of these superheroes but also delves into the intricacies of their individual journeys, providing fans with a more comprehensive and satisfying cinematic experience.";
                moviesList.add(movieObj1);

                System.out.println(moviesList.get(choice - 1));
                break;
            
            case 2: 

                movieObj2.description = "Sure, here's a short summary of \"Godzilla vs. Kong\" (2021) along with a cast list and a brief description:\r\n" + //
                        "\r\n" + //
                        "**Movie: Godzilla vs. Kong (2021)**\r\n" + //
                        "\r\n" + //
                        "**Summary:**\r\n" + //
                        "In \"Godzilla vs. Kong,\" the two iconic Titans, Godzilla and Kong, clash in an epic battle that will determine the fate of the world. As humanity seeks to uncover the origins of the Titans and their connection to the Earth, they find themselves caught in the crossfire of a colossal showdown between these mighty creatures.\r\n" + //
                        "\r\n" + //
                        "**Cast:**\r\n" + //
                        "- Alexander Skarsgård as Nathan Lind\r\n" + //
                        "- Millie Bobby Brown as Madison Russell\r\n" + //
                        "- Rebecca Hall as Dr. Ilene Andrews\r\n" + //
                        "- Brian Tyree Henry as Bernie Hayes\r\n" + //
                        "- Shun Oguri as Ren Serizawa\r\n" + //
                        "- Eiza González as Maya Simmons\r\n" + //
                        "- Julian Dennison as Josh Valentine\r\n" + //
                        "- Kyle Chandler as Dr. Mark Russell\r\n" + //
                        "\r\n" + //
                        "**Description:**\r\n" + //
                        "\"Godzilla vs. Kong\" is a thrilling monster film that brings together two of cinema's most iconic giant creatures. Directed by Adam Wingard, the movie offers spectacular visual effects, intense action sequences, and a gripping storyline as Godzilla and Kong face off in an epic battle, with the fate of humanity hanging in the balance. The film explores the mysteries of the Titans and the ancient rivalry between them, delivering a visually stunning and action-packed cinematic experience.";
                moviesList.add(movieObj2);

                System.out.println(moviesList.get(choice - 1));

                break;
            
            case 3: 

                movieObj3.description = "**Title: Mortal Kombat (2021)**\r\n" + //
                        "\r\n" + //
                        "**Summary:**\r\n" + //
                        "\"Mortal Kombat\" (2021) is a martial arts fantasy film based on the popular video game franchise of the same name. The story revolves around Cole Young, a washed-up MMA fighter who discovers he is part of a mystical tournament known as Mortal Kombat. Earthrealm's champions must battle against the forces of Outworld to prevent the evil Shang Tsung from conquering the realms. As the fighters unlock their unique abilities, a fierce and brutal tournament ensues, leading to epic battles and the fate of the world hanging in the balance.\r\n" + //
                        "\r\n" + //
                        "**Cast:**\r\n" + //
                        "- Lewis Tan as Cole Young\r\n" + //
                        "- Jessica McNamee as Sonya Blade\r\n" + //
                        "- Josh Lawson as Kano\r\n" + //
                        "- Joe Taslim as Sub-Zero\r\n" + //
                        "- Mehcad Brooks as Jax Briggs\r\n" + //
                        "- Ludi Lin as Liu Kang\r\n" + //
                        "- Chin Han as Shang Tsung\r\n" + //
                        "- Tadanobu Asano as Raiden\r\n" + //
                        "- Hiroyuki Sanada as Scorpion\r\n" + //
                        "- Max Huang as Kung Lao\r\n" + //
                        "\r\n" + //
                        "**Description:**\r\n" + //
                        "\"Mortal Kombat\" brings the iconic video game characters to life with stunning visuals, intense martial arts choreography, and a plot that delves into the rich lore of the Mortal Kombat universe. The film pays homage to the game's signature fatalities while introducing a new protagonist in Cole Young, who becomes a pivotal figure in the struggle for Earthrealm's survival. With a mix of action-packed sequences and nods to the game's mythology, \"Mortal Kombat\" offers an entertaining experience for both fans and newcomers to the franchise.";
                moviesList.add(movieObj3);

                System.out.println(moviesList.get(choice -1 ));

                break;
            
            case 4:

                movieObj4.description = "**A Quiet Place Part II (2021)**\r\n" + //
                        "\r\n" + //
                        "**Summary:**\r\n" + //
                        "\"A Quiet Place Part II\" is a horror-thriller film directed by John Krasinski, serving as a sequel to the 2018 film \"A Quiet Place.\" The story picks up immediately after the events of the first film, following the Abbott family as they navigate a world overrun by alien creatures that hunt using sound. Forced to venture into the unknown, they discover that the creatures are not the only threats lurking in the shadows, and silence remains crucial for survival.\r\n" + //
                        "\r\n" + //
                        "**Cast:**\r\n" + //
                        "- Emily Blunt as Evelyn Abbott\r\n" + //
                        "- Millicent Simmonds as Regan Abbott\r\n" + //
                        "- Noah Jupe as Marcus Abbott\r\n" + //
                        "- Cillian Murphy as Emmett\r\n" + //
                        "- Djimon Hounsou as Man on Island\r\n" + //
                        "\r\n" + //
                        "**Short Description:**\r\n" + //
                        "\"A Quiet Place Part II\" continues the suspenseful journey of the Abbott family in a world where making the slightest noise can attract deadly creatures. As they face new challenges and meet other survivors, the film explores the lengths a family must go to protect each other in a post-apocalyptic landscape. The cast delivers compelling performances, and the film builds on the tension and unique premise established in the first installment, offering a gripping and intense cinematic experience.";
                moviesList.add(movieObj4);

                System.out.println(moviesList.get(choice -1));

                break;
            
            case 5:

                movieObj5.description = "**Movie Title: Shang-Chi and the Legend of the Ten Rings (2021)**\r\n" + //
                        "\r\n" + //
                        "**Summary:**\r\n" + //
                        "\"Shang-Chi and the Legend of the Ten Rings\" follows the journey of Shang-Chi, a skilled martial artist who has been living a quiet life in San Francisco. His past catches up with him when he is drawn into the mysterious Ten Rings organization, led by his father Wenwu. Shang-Chi is forced to confront his family's dark legacy and the true nature of the Ten Rings, ancient artifacts with immense power. As he faces powerful adversaries, Shang-Chi must embrace his destiny and harness his extraordinary abilities to prevent the Ten Rings from falling into the wrong hands.\r\n" + //
                        "\r\n" + //
                        "**Cast:**\r\n" + //
                        "- **Simu Liu** as Shang-Chi\r\n" + //
                        "- **Awkwafina** as Katy\r\n" + //
                        "- **Tony Leung** as Wenwu (The Mandarin)\r\n" + //
                        "- **Meng'er Zhang** as Xialing\r\n" + //
                        "- **Fala Chen** as Jiang Li\r\n" + //
                        "- **Michelle Yeoh** as Ying Nan\r\n" + //
                        "- **Ben Kingsley** as Trevor Slattery\r\n" + //
                        "- **Ronny Chieng** as Jon Jon\r\n" + //
                        "- **Florian Munteanu** as Razor Fist\r\n" + //
                        "- **Zach Cherry** as Cleve\r\n" + //
                        "\r\n" + //
                        "**Short Description:**\r\n" + //
                        "\"Shang-Chi and the Legend of the Ten Rings\" is a Marvel Cinematic Universe (MCU) film that introduces Shang-Chi, a skilled fighter with a mysterious past. The movie seamlessly blends intense martial arts action with a compelling narrative about identity, family, and the legacy of the Ten Rings organization. As Shang-Chi battles powerful enemies, including his own father, the film explores themes of self-discovery and the responsibility that comes with great power. With a diverse and talented cast, the movie received acclaim for its action sequences, storytelling, and cultural representation within the MCU.";
                moviesList.add(movieObj5);

                System.out.println(moviesList.get(choice -1));

                break;

            case 6:

                movieObj6.description = "Title: Venom: Let There Be Carnage (2021)\r\n" + //
                        "\r\n" + //
                        "**Summary:**\r\n" + //
                        "\"Venom: Let There Be Carnage\" is a superhero film directed by Andy Serkis. It is the sequel to the 2018 film \"Venom\" and is part of Sony's Spider-Man Universe. The movie follows Eddie Brock (Tom Hardy), a journalist who is bonded with an alien symbiote known as Venom. In this installment, Eddie Brock struggles to coexist with Venom while facing a new threat in the form of Cletus Kasady (Woody Harrelson), a serial killer who becomes the host for the dangerous symbiote Carnage. As the conflict intensifies, Eddie must confront his own inner demons and the chaos unleashed by Carnage.\r\n" + //
                        "\r\n" + //
                        "**Cast:**\r\n" + //
                        "1. Tom Hardy as Eddie Brock / Venom\r\n" + //
                        "2. Woody Harrelson as Cletus Kasady / Carnage\r\n" + //
                        "3. Michelle Williams as Anne Weying\r\n" + //
                        "4. Reid Scott as Dan Lewis\r\n" + //
                        "5. Naomie Harris as Frances Barrison / Shriek\r\n" + //
                        "6. Stephen Graham as Detective Mulligan\r\n" + //
                        "\r\n" + //
                        "**Description:**\r\n" + //
                        "\"Venom: Let There Be Carnage\" explores the complex relationship between Eddie Brock and the symbiote Venom, introducing the menacing Carnage into the mix. The film blends action, humor, and a darker storyline as Eddie grapples with his own internal struggles and faces a formidable adversary in Carnage. The dynamic between Tom Hardy's Eddie Brock and the alien symbiote continues to be a central focus, offering both entertaining and introspective moments as they navigate a world filled with symbiotic chaos.";
                moviesList.add(movieObj6);

                System.out.println(moviesList.get(choice -1));

                break;
            
            case 7:

                movieObj7.description = "**Movie Title: Spider-Man: No Way Home (2021)**\r\n" + //
                        "\r\n" + //
                        "**Summary:**\r\n" + //
                        "\"Spider-Man: No Way Home\" follows Peter Parker (Tom Holland) as he grapples with the aftermath of revealing his secret identity. With his life turned upside down, Peter seeks the help of Doctor Strange (Benedict Cumberbatch) to erase people's memories of him being Spider-Man. However, a spell goes awry, leading to the multiverse colliding. Peter teams up with alternate versions of Spider-Man, played by Tobey Maguire and Andrew Garfield, to face powerful foes from different realities. The stakes are higher than ever as they attempt to restore order and prevent the collapse of the multiverse.\r\n" + //
                        "\r\n" + //
                        "**Cast:**\r\n" + //
                        "- Tom Holland as Peter Parker / Spider-Man\r\n" + //
                        "- Zendaya as MJ (Michelle Jones)\r\n" + //
                        "- Benedict Cumberbatch as Doctor Strange\r\n" + //
                        "- Tobey Maguire as Peter Parker / Spider-Man (from Sam Raimi's Spider-Man trilogy)\r\n" + //
                        "- Andrew Garfield as Peter Parker / Spider-Man (from The Amazing Spider-Man series)\r\n" + //
                        "- Marisa Tomei as May Parker\r\n" + //
                        "- Jacob Batalon as Ned Leeds\r\n" + //
                        "- Jon Favreau as Happy Hogan\r\n" + //
                        "- Willem Dafoe as Norman Osborn / Green Goblin\r\n" + //
                        "- Alfred Molina as Otto Octavius / Doctor Octopus\r\n" + //
                        "- Jamie Foxx as Max Dillon / Electro\r\n" + //
                        "- Benedict Wong as Wong\r\n" + //
                        "\r\n" + //
                        "**Description:**\r\n" + //
                        "\"Spider-Man: No Way Home\" is an epic superhero film that not only continues the journey of Tom Holland's Spider-Man but also brings together multiple Spider-Men from different cinematic universes. Packed with action, humor, and heartfelt moments, the film explores the consequences of identity revelation and the challenges of navigating a multiverse filled with iconic villains. The collaboration of three Spider-Men adds a nostalgic touch, delighting fans with a cinematic event that spans the Spider-Man franchise's rich history.";
                moviesList.add(movieObj7);

                System.out.println(moviesList.get(choice -1));

            break;

            case 8: 

                movieObj8.description = "\"The Suicide Squad\" (2021):\r\n" + //
                        "\r\n" + //
                        "**Summary:**\r\n" + //
                        "Directed by James Gunn, \"The Suicide Squad\" is a standalone sequel to the 2016 film \"Suicide Squad.\" Task Force X, a secret government-run team of imprisoned supervillains, is sent on a dangerous mission to the island of Corto Maltese. Their objective is to destroy a Nazi-era prison and laboratory known as Jotunheim, where nefarious experiments are taking place.\r\n" + //
                        "\r\n" + //
                        "**Cast:**\r\n" + //
                        "- Margot Robbie as Harley Quinn\r\n" + //
                        "- Idris Elba as Bloodsport\r\n" + //
                        "- John Cena as Peacemaker\r\n" + //
                        "- Viola Davis as Amanda Waller\r\n" + //
                        "- Joel Kinnaman as Rick Flag\r\n" + //
                        "- Sylvester Stallone as the voice of King Shark\r\n" + //
                        "- Jai Courtney as Captain Boomerang\r\n" + //
                        "- Daniela Melchior as Ratcatcher 2\r\n" + //
                        "- David Dastmalchian as Polka-Dot Man\r\n" + //
                        "- Michael Rooker as Savant\r\n" + //
                        "- Peter Capaldi as The Thinker\r\n" + //
                        "- Alice Braga as Sol Soria\r\n" + //
                        "\r\n" + //
                        "**Short Description:**\r\n" + //
                        "\"The Suicide Squad\" brings together a motley crew of antiheroes and villains, each with their own set of unique abilities and quirks, on a high-stakes mission filled with chaos and dark humor. Director James Gunn's take on the Suicide Squad franchise delivers a thrilling and irreverent blend of action, comedy, and unexpected twists as the team navigates through a perilous mission with consequences that keep audiences on the edge of their seats.";
                moviesList.add(movieObj8);

                System.out.println(moviesList.get(choice -1));

                break;

            case 9:

                movieObj9.description = "**Title: F9: The Fast Saga (2021)**\r\n" + //
                        "\r\n" + //
                        "**Summary:**\r\n" + //
                        "\"F9: The Fast Saga\" is the ninth installment in the \"Fast & Furious\" franchise. Directed by Justin Lin, the film continues the high-octane adventures of Dominic Toretto (Vin Diesel) and his crew. This time, they face a new threat in the form of Dom's estranged brother, Jakob Toretto (John Cena), a deadly assassin working with a cyberterrorist named Cipher (Charlize Theron). The plot revolves around family, loyalty, and the fast-paced world of illegal racing and espionage.\r\n" + //
                        "\r\n" + //
                        "**Cast:**\r\n" + //
                        "- Vin Diesel as Dominic Toretto\r\n" + //
                        "- Michelle Rodriguez as Letty Ortiz\r\n" + //
                        "- Jordana Brewster as Mia Toretto\r\n" + //
                        "- Tyrese Gibson as Roman Pearce\r\n" + //
                        "- Ludacris as Tej Parker\r\n" + //
                        "- John Cena as Jakob Toretto\r\n" + //
                        "- Nathalie Emmanuel as Ramsey\r\n" + //
                        "- Sung Kang as Han Lue\r\n" + //
                        "- Charlize Theron as Cipher\r\n" + //
                        "- Helen Mirren as Magdalene Shaw\r\n" + //
                        "- Michael Rooker as Buddy\r\n" + //
                        "- Kurt Russell as Mr. Nobody\r\n" + //
                        "- Thue Ersted Rasmussen as Otto\r\n" + //
                        "\r\n" + //
                        "**Short Description:**\r\n" + //
                        "\"F9\" delivers the adrenaline-fueled action and heart-stopping stunts the franchise is known for, as Dom and his crew embark on a globe-trotting mission to stop a world-threatening conspiracy. The film explores the dynamics of family, forgiveness, and the consequences of choices made in the past. With its signature mix of car chases, spectacular set pieces, and an ensemble cast, \"F9: The Fast Saga\" continues to push the boundaries of the \"Fast & Furious\" universe.";
                moviesList.add(movieObj9);

                System.out.println(moviesList.get(choice -1));

                break;

            case 10:

                movieObj10.description = "**Movie Title: Eternals (2021)**\r\n" + //
                        "\r\n" + //
                        "**Summary:**\r\n" + //
                        "\"Eternals\" is a Marvel Cinematic Universe (MCU) film directed by Chloé Zhao. The story revolves around a group of ancient, immortal beings known as the Eternals, who have secretly lived on Earth for thousands of years. When the emergence of the Deviants threatens humanity, the Eternals must come out of hiding and reunite to protect the planet. As they face this new enemy, the Eternals also confront their own internal conflicts and questions about their purpose.\r\n" + //
                        "\r\n" + //
                        "**Cast:**\r\n" + //
                        "1. Gemma Chan as Sersi\r\n" + //
                        "2. Richard Madden as Ikaris\r\n" + //
                        "3. Angelina Jolie as Thena\r\n" + //
                        "4. Salma Hayek as Ajak\r\n" + //
                        "5. Kit Harington as Dane Whitman\r\n" + //
                        "6. Kumail Nanjiani as Kingo\r\n" + //
                        "7. Lia McHugh as Sprite\r\n" + //
                        "8. Brian Tyree Henry as Phastos\r\n" + //
                        "9. Lauren Ridloff as Makkari\r\n" + //
                        "10. Barry Keoghan as Druig\r\n" + //
                        "11. Don Lee as Gilgamesh\r\n" + //
                        "\r\n" + //
                        "**Short Description:**\r\n" + //
                        "\"Eternals\" introduces a new group of powerful beings in the Marvel Cinematic Universe. The film explores their connection to Earth, their role in shaping human history, and their response to a looming threat. The diverse cast brings these immortal characters to life, blending action, mythology, and introspection into the Marvel superhero formula. As the Eternals unite to face the Deviants, the film delves into themes of duty, identity, and the consequences of intervening in human affairs.";
                moviesList.add(movieObj10);

                System.out.println(moviesList.get(choice -1));

                break;

        
            default:

            System.out.println("Invalid Choice!!");
                break;
        }
        
    }

    void MoviesListLoop(ArrayList<MovieObj> movieObjs){

        int count = 1;

        for (int i = 0; i < movieObjs.size(); i++,count++) {
            System.out.println(count + " " + movieObjs.get(i).movieName);
        }

    }

    
}
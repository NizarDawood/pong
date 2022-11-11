# pong
Uppgiften är att skapa tre klasser som kan fungera som en modell (i ett MVC-tänk) för spelet Pong. Ni ska skapa de klasser som beskrivs nedan och implementera de metoder som finns med. Klassdiagrammet finns som bild nedan och beskrivningen av de olika delarna lyder så här:

#Ball.
Klassen representerar bollen och har en position och en hastighet. 
Hastigheten är +/-1 i x-led och y-led. Konstruktorn placerar bollen 
på en given x och y-position och hastigheten sätts till 1 i både x 
och y-led. Metoden move() flyttar bollen ett tidssteg framåt, x=x+vx 
och y=y+vy. Metoden bounce(Paddle p) kontrollerar om bollen studsar på 
paddeln p och inverterar då hastigheten i x-led. Metoden bounce() anropas
utifrån (av Pong) och inverterar hastigheten i y-led (Ball vet inte höjd
och bredd så den kan inte kolla det själv)
#Paddle.
Klassen representerar en paddel. Det behövs bara en klass, Pong har två instanser 
av klassen. En paddel har en x och en y-koordinat samt en längd. Konstruktorn sätter x och y
koordinaterna och sätter längden till 10. Metoderna moveUp() och moveDown() är tänkta att
kopplas till spelarnas kontroller och flyttar paddeln upp och ner 1 steg.
Pong. Klassen är den huvudsakliga modellen för ett Pong-spel och består av (har-en relation)
en boll (Ball) och två paddlar (Paddle). Dessutom finns bredden och höjden av spelplanen med
som attribut (variabler i klassen). Klassens konstruktor tar en bredd och en höjd och sätter 
dessa variabler. Bollen och de två paddlarna ska skapas och placeras på rätt plats, bollen i mitten och paddlarna mitt på vänster och höger kant, 2 steg in på spelplanen. Metoden update() ska flytta bollen (b.move()) och sedan kontrollera om bollen kolliderar med någon av kanterna. Detta är metoden checkCollision()s uppgift. Om bollen tar i övre eller nedre kanten ska bollens hastighet i y-led inverteras.
Skapa ett projekt i IntelliJ, lägg upp det på git och lämna in länken till repot som svar på frågan. Bygg sedan klasserna i ordningen Paddle, Ball och Pong. Skriv testprogram som undersöker att sakerna funkar men kom ihåg att ni inte ska bygga ett fungerande spel, bara implementera modellen.
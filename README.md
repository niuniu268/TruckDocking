# Assignment_1_HongweiHan


Beskrivning av programmet
Skapa ett program som hanterar avlastning av olika lastbilar vid stationen “Dumpa mera”.

I programmet ska det finnas tre olika typer av lastbilar
Skåpbil (van)
Lätt lastbil (Small truck)
Tung lastbil (Heavy truck)

Avlastningsstationen Dumpa mera består av 5 avlastningskajer med etiketterna A-E. Typiskt använder skåpbilar kajen A och B, lätt lastbil kaj C och D och tung lastbil kaj E. Dock finns det undantag som beskrivs i kravspecifikationen.
Kravspecifikation
Se exempel på utskrifter under bilagor
Avlastning
Skåpbil kan endast avlasta vid A och B
En lätt lastbil kan avlasta vid C och D
samt A ifall den väger under 5 ton
Tung lastbil kan avlasta vid E
samt D ifall den väger under 9 ton
Tjänster
När programmet startas ska användaren kunna välja att
se dockade lastbilars kajplats, lastbilstyp samt vikt
registrera en ny lastbil vid stationen

## Result
 -  When users start the program, they can find an initial interface.

![List](https://github.com/niuniu268/TruckDocking/blob/master/images/Screenshot%202022-10-20%20at%201.png "")

- If the users choose 1, they should see an empty list. 

![The empty list](https://github.com/niuniu268/TruckDocking/blob/master/images/Screenshot%202022-10-20%20at%202.png "")

- When the users decide to register a new truck, they need to choose 2. And then they can select which type of truck and the weight of truck. When they finish the selection, the program will print out what they choose.

![List 2](https://github.com/niuniu268/TruckDocking/blob/master/images/Screenshot%202022-10-20%20at%203.png "")

- If the users choose more vans than the limitation, the program will publish a warning message. Meanwhile, the program will return the inituial interface.

![List 3](https://github.com/niuniu268/TruckDocking/blob/master/images/Screenshot%202022-10-20%20at%204.png "")

- If the users choose a small truck which weight is less than 5000 kg, the program will register dock A.

![List 4](https://github.com/niuniu268/TruckDocking/blob/master/images/Screenshot%202022-10-20%20at%205.png "")

- Otherwise, the program will register dock C or dock D.

![List 5](https://github.com/niuniu268/TruckDocking/blob/master/images/Screenshot%202022-10-20%20at%206.png "")

- After registration, the users can find a list when they choose 1 in the initial interface.

![List 6](https://github.com/niuniu268/TruckDocking/blob/master/images/Screenshot%202022-10-20%20at%207.png "")

- When the users choose 3 in the initial interface, the program will automatically close up.

![List 7](https://github.com/niuniu268/TruckDocking/blob/master/images/Screenshot%202022-10-20%20at%208.png "")
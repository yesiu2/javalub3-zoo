# javalub3-zoo

Naszym zadaniem będzie stworzenie aplikacji, która będzie modelowała zoo. Będziemy krok po kroku rozbudowywali aplikację o kolejne elementy, pamiętając o technikach i dobrych zasadach, których nauczyliśmy się do tej pory. Logikę aplikacji będziemy tworzyli korzystając z TDD.

Stworzyliśmy odpowiednią hierarchię zwierząt. Jako kierownicy zoo będziemy sprawdzali czy każde zwierzę (Animal) żyje oraz ważyli je od czasu do czasu w ramach rutynowych badań.

Niestety nie udało się nam otrzymać dofinansowania od UE na nowy startup, więc na razie w naszym zoo będą się znajdowały tylko niedźwiedzie (Bear). Na początek będą się tam znajdowały niedźwiedzie czarne (BlackBear), niedźwiedzie brunatne (BrownBear) i niedźwiedzie polarne (PolarBear).

Nasze niedźwiedzie to nietypowe zwierzęta. Żeby sprawdzić czy żyją (isAlive) należy przypomnieć sobie ostatnią datę ich posiłku. Jeśli zwierzę jadło mniej niż 10 dni temu, to jest żywe. Warto tutaj pomyśleć o JodaTime.

Aby utrzymywać nasze niedźwiedzie przy życiu powinniśmy żywić nasze zwierzaki. Każdy niedźwiedź powinien mieć możliwość jedzenia (eat). Wystarczy, by metoda ustawiała czas posiłku na obecną datę. Zjedzenie powinno ożywiać niedźwiedzia oraz wydłużać jego obecny czas życia.

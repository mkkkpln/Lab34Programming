import enums.Body;
import exceptions.NoPhoneOnTable;
import things.*;
import enums.Emotion;
import locations.TypeOfLocation;
import persons.*;

public class Main extends Time {
    public static void main(String[] args) {

        System.out.println("Запуск моей программы\n");

        // Setup story objects
        System.out.println("Процесс создания объектов начался... \n");


        Waiter waiter = new Waiter("официант", 36);
        Shorty Neznaika = new Shorty("Незнайка", 12, TypeOfLocation.AVENUE, Emotion.NORMAL, 75);
        Policeman policeman = new Policeman("Полицейский", 42, TypeOfLocation.UNVENTILATEDROOM, Emotion.NORMAL);
        Policeman tallshorty = new Policeman("рослый коротышка", 42, TypeOfLocation.UNVENTILATEDROOM, Emotion.NORMAL);
        Driver driver = new Driver("Шофер", 75);
        Motor motor = new Motor("Мотор", 249);
        Car car = new Car("Автомобиль", motor);
        Policeman figle = new Policeman("Фигль", 42, TypeOfLocation.UNVENTILATEDROOM, Emotion.NORMAL);
        Policeman migle = new Policeman("Мигль", 42, TypeOfLocation.UNVENTILATEDROOM, Emotion.NORMAL);
        Policeman both = new Policeman("Оба", 42, TypeOfLocation.UNVENTILATEDROOM, Emotion.NORMAL);
        Arrested arrested = new Arrested("арестованные", 25 - 30, TypeOfLocation.UNVENTILATEDROOM, Emotion.NORMAL);
        PartOfBody.Forehead forehead = new PartOfBody.Forehead("лоб");
        PartOfBody.Hands hands = new PartOfBody.Hands("руками");
        Room.Table table = new Room.Table("стол");
        Room.PhotoMachine photoMachine = new Room.PhotoMachine("фотографический автомат");
        Room.XRAY xray = new Room.XRAY("рентгеновский аппарат");
        Room.Shtafirka shtafirka = new Room.Shtafirka("штафирка");//внутренний класс
        Room.Table.Phone phone = table.new Phone("телефонный аппарат");//вложенный класс
        Room.Table.BigBox bigBox = table.new BigBox("ящик");
        Room.Table.LittleBox littleBox = table.new LittleBox("коробочка");
        Room.Table.Helmet helmet = new Room.Table.Helmet("каска");
        Policeman drigle = new Policeman("Дригль", 42, TypeOfLocation.UNVENTILATEDROOM, Emotion.NORMAL);
        Room.Wardrobe wardrobe = new Room.Wardrobe("высокие шкафы");
        Story story = new Story();
        Time time = new Time();

        System.out.println("Объекты успешно созданы.\n");


        // Начало
        story.narrate();


        //"Что ж, здесь вполне хорошо! -- благодушно подумал Незнайка. -- Видно, и на Луне живут добрые коротышки!"
        System.out.println(Neznaika.think());

        //Все, что произошло с ним до этого, стало казаться ему каким-то недоразумением или нелепым сном, о котором не стоит и вспоминать.
        Neznaika.happened(new String[]{"Упал", "Нагрубили", "Помог бабушке", "Все, что произошло с ним до этого, стало казаться ему каким-то недоразумением или нелепым сном, о котором не стоит и вспоминать."});

        //Поднявшись из-за стола и помахав официанту издали на прощание ручкой. Незнайка отправился дальше, но официант быстро догнал его и, вежливо улыбнувшись, сказал:
        Neznaika.transfer(waiter);
        waiter.catchUp();
        waiter.say("А как же счёт?");

        //Улыбка моментально соскочила у официанта с лица. Он даже как-то неестественно побледнел от злости.
        waiter.pale();

        //Схватив Незнайку за руку, он оттащил его в сторону и, достав из кармана свисток, пронзительно засвистел.
        waiter.pull(Neznaika);
        waiter.whistle();


        //Сейчас же откуда-то из темноты вынырнул рослый коротышка в синем мундире с блестящими металлическими пуговицами и в медной каске на голове. В руках у него была увесистая резиновая дубинка, а у пояса пистолет в кобуре.
        tallshorty.comeUp(TypeOfLocation.DARKNESS.toString());
        figle.count(Room.Table.Phone.getPhones());

        //Незнайка невольно откинул голову назад. Незнайка осторожно понюхал кончик дубинки.
        Neznaika.putHeadBack(Body.голову);
        Neznaika.smell(Neznaika);

        //Незнайка машинально поднял голову и вытянул руки по швам.
        Neznaika.riseUp();
        Neznaika.stretchArms(policeman);

        //Полицейский ткнул его кончиком дубинки в лоб. Раздался треск.
        policeman.stick(forehead);

        //Незнайку ударило электрическим током, да так сильно, что искры полетели из глаз, в голове загудело, и он зашатался, не в силах устоять на ногах.
        Neznaika.stagger();

        //Схватив Незнайку за шиворот, полицейский принялся шарить у него в карманах и, ничего в них не обнаружив, потащил его сквозь толпу, которая начала собираться вокруг. Толпа моментально рассеялась.
        policeman.search(Neznaika);
        policeman.pull();

        //Полицейский протащил Незнайку по улице, свернул в узенький переулок и остановился возле черной полицейской машины, напоминавшей автофургон с небольшим зарешеченным окном в кузове.
        policeman.pull(TypeOfLocation.STREET.toString());
        policeman.turn();
        policeman.stop();

        //Открыв настежь дверцу, которая была с задней стороны кузова, он повелительно кивнул Незнайке пальцем и, нахмурив брови, сказал: Увидев, что Незнайка медлит, он с такой силой ткнул его в спину дубинкой, что тот кувырком полетел в кузов.
        policeman.nod();
        policeman.say("Какой непослушный коротышка!");

        //Увидев, что Незнайка медлит, он с такой силой ткнул его в спину дубинкой, что тот кувырком полетел в кузов.
        Neznaika.slow();
        policeman.stick2(Neznaika);
        Neznaika.fall(Neznaika);


        //Не успел Незнайка сообразить, что произошло, как дверца за ним захлопнулась. Поднявшись с грязного, заплеванного пола, Незнайка приналег на дверцу плечом, но она не открывалась.
        Neznaika.understand(new Room.Door("дверца"));
        Neznaika.lie(Body.плечом);

        //Тогда он изо всех сил забарабанил в дверь кулаком и закричал:
        Neznaika.drum(Body.кулаком);
        Neznaika.loud("Спасите! Помогите!");

        //Полицейский, однако, не удостоил его ответом, а сел в кабину рядом с шофером и скомандовал:
        policeman.silent(Neznaika.getName());
        policeman.sit(TypeOfLocation.CAR);
        policeman.command("Вперёд!");

        //Мотор загудел. Автомобиль запрыгал по камням мостовой, и через четверть часа Незнайка уже был в полицейском управлении.
        motor.voice();
        car.jump();
        driver.goToLocation(TypeOfLocation.CAR);

        //Полицейский, которого, кстати сказать, звали Фиглем, сдал Незнайку с рук на руки другому полицейскому, которого звали Миглем.
        policeman.give(Neznaika);

        //Полицейский Мигль был одет в такой же мундир, как и Фигль, только пуговицы на его мундире не отличались таким ярким блеском, как пуговицы на мундире Фигля. Это объяснялось тем, что служба полицейского Мигля протекала не на открытом воздухе, а в закрытом, плохо проветриваемом помещении, отчего металл, из которого были сделаны пуговицы, постепенно покрывался окислами и тускнел.
        migle.work(TypeOfLocation.OPENAIR);
        figle.work(TypeOfLocation.UNVENTILATEDROOM);


        System.out.println("\n\n ... начинается длинный рассказ про комнату... \n\n");
        timeGone(25);
        System.out.println("\n\n");

        // Все стены этого помещения были заставлены высокими шкафами, в которых хранились сведения о различных преступниках. Посреди комнаты стоял крепкий дубовый стол с тяжелыми прямыми четырехугольными ножками.
        wardrobe.keep();
        table.stand(6);

        //Позади стола с одной стороны стоял фотографический автомат для изготовления фотокарточек, с другой стороны находился рентгеновский аппарат, с помощью которого просвечивали арестованных насквозь, чтоб узнать, не утаили ли они похищенных ценностей у себя в желудке, предварительно проглотив их.
        photoMachine.stand();
        xray.stand();
        arrested.conceal();
        shtafirka.stand();


        try {
            phone.lose(21);
        } catch (NoPhoneOnTable e) {
            System.out.println(e.getMessage());
            System.out.println("Сколько телефонов? " + 21);
        }

        //На столе стояли телефонный аппарат, ящик с чистыми бланками для регистрации арестованных, плоская коробочка с черной типографской краской для изготовления отпечатков пальцев и медная каска Мигля. Для точности необходимо сказать, что медная каска Мигля блестела менее ярко, нежели каска Фигля.
        Neznaika.addItem(littleBox);
        Neznaika.addItem(bigBox);
        policeman.checkItem(Neznaika);
        table.have(phone, bigBox, littleBox);
        helmet.shine();

        //Это обстоятельство особенно хорошо стало заметно, когда вошедший в комнату Фигль снял с головы каску и поставил ее на столе рядышком с каской Мигля.
        figle.takeOff(figle);
        figle.put();

        //При этом обнаружилось еще и то, что между Миглем и Фиглем было большое сходство: оба были скуластые, широколицые, у обоих были низкие лбы и темные, жесткие, подстриженные ежиком волосы, начинавшиеся чуть ли не от самых бровей.
        both.be();
        figle.exist(figle);
        migle.joke();

        //Как только дверь затворилась за Фиглем, Мигль сказал Незнайке:
        migle.tell(new Room.Door("дверь"), "Вы будете наказаны!");
        Neznaika.waveHands(hands, Neznaika);
        Neznaika.watch();

        // Достав из ящика чистый бланк, Мигль записал на нем Незнайкино имя, проставил рост, размер головы и носа, снял с него фотокарточку, просветил рентгеном, после чего испачкал ему обе руки черной краской и заставил оставить отпечатки пальцев на бланке. Мигль нажал кнопку электрического звонка, и в дверь вошел полицейский Дригль -- такое же широкоскулое, туповатое лицо с низким лбом и подстриженными ежиком волосами. Дригль хмуро взглянул на Незнайку
        migle.write(Neznaika);
        migle.press();
        drigle.comeUp();
        drigle.watch(Neznaika);

        story.complete();
    }

    static class Story {
        public void narrate() {
            class Beginning { //локальный класс без модификаторов
                void start() {

                    System.out.println("Наша история про коротышек началась, приятного чтения!\n");
                }
            }
            Beginning beginning = new Beginning();
            beginning.start();
        }


        interface Finishable {
            void finish();
        }

        class End { // анонимный c интерфейсом
            Finishable finishes;

            End(Finishable finishes) {

                this.finishes = finishes;
            }

            public void close() {

                finishes.finish();
            }
        }


        public void complete() {
            End end = new End(new Finishable() {
                public void finish() {
                    System.out.print("\nЧудесная история подошла к концу! Для того, чтобы узнать о дальнейших приключениях Незнайки, можете прочитать книгу!\n");
                }
            });
            end.close();
        }
    }
}
//    лямбда(автоматическое изменение джавы)
//    public void complete() {
//        End end = new End(() -> System.out.print("\nЧудесная история подошла к концу! Для того, чтобы узнать о дальнейших приключениях Незнайки, можете прочитать книгу!\n"));
//        end.close();
//    }







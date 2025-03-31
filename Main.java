import java.net.FileNameMap;

public class Main {
    public static void main(String[] args){
        
        Scene finalScene = new Scene("Kamu berhasil mengalahkan naga dan menjadi pahlawan. Raja memberimu tiga pilihan hadiah.",
        "Menikahi Putri Raja", null, 5, 5, 
        "Menjadi Patih Kerajaan", null, 0, 10, 
        "Tetap menjadi ksatria petualang", null, 0, 10);

        Scene finalBattleScene = new Scene("Pasukan naga telah melemah. Ini adalah pertarungan terakhir untuk menyelamatkan kerajaan!",
        "Menyerang langsung ke medan perang", finalScene, 20, 10, 
        "Memimpin strategi pertahanan", finalScene, 10, 20, 
        "Menggunakan kekuatan dari air kuil", finalScene, 5, 30);

        Scene dragonScene = new Scene("Kamu hampir sampai di ibu kota, tapi pasukan naga mengepung kota.",
        "Membasmi semua pasukan naga", finalBattleScene, 15, 10, 
        "Mencari pemimpin naga dan mengalahkannya", finalBattleScene, 10, 15, 
        "Menyusup ke dalam kota untuk menyerang balik", finalBattleScene, 20, 20);

        Scene ruinsScene = new Scene("Setelah melewati kelelawar, kamu menemukan reruntuhan kuno. Ada peti harta yang tampaknya terkutuk.",
        "Membuka peti harta", dragonScene, 20, 0, 
        "Meninggalkan peti", dragonScene, 0, 5, 
        "Mencari informasi tentang peti", dragonScene, 5, 10);

        Scene flyScene = new Scene("Kamu berhasil menguasai elang dan terbang melintasi langit. Namun, sekawanan kelelawar menghadang.",
        "Menabrakkan elang ke kelelawar", ruinsScene, 10, 3, 
        "Menyerang dengan pedang", ruinsScene, 5, 5, 
        "Menghindari serangan kelelawar", ruinsScene, 0, 5);

        Scene eagleScene = new Scene("Kamu terjebak di puncak gunung. Seekor elang raksasa terbang di atas langit. Apa yang akan kamu lakukan?",
            "Menjinakkan elang dengan memberinya air", flyScene, 0, 5, 
            "Menangkap elang", flyScene, 15, 5, 
            "Menyiram elang dengan air", flyScene, 20, 0);

        Scene mountainScene = new Scene("Di puncak gunung, ada kuil dengan kolam suci yang dipercaya memiliki kekuatan magis.",
            "Berendam di kolam", eagleScene, 0, 5, 
            "Meminum air kolam", eagleScene, 5, 0, 
            "Melanjutkan perjalanan", eagleScene, 0, 0);

        Scene forestScene = new Scene("Saat keluar dari kota, sekelompok begal menghadang dan meminta semua barangmu.",
            "Mengalahkan begal", mountainScene, 15, 10, 
            "Lawan secara defensif", mountainScene, 10, 15, 
            "Menyerahkan semua barang", mountainScene, 30, 0);
    
        Scene oldCityScene = new Scene("Kamu telah memasuki kota tua. Kamu bisa memperkuat perlengkapan atau merekrut teman.",
            "Mengupgrade armor dan senjata", forestScene, 5, 15, 
            "Membeli kuda", forestScene, 0, 20, 
            "Bergabung dengan kelompok petualang", forestScene, 10, 10);
        
        Scene giantScene = new Scene("Setelah mengalahkan ular, kamu sampai di kota tua. Namun, ada raksasa menjaga pintu masuk.",
            "Bertarung dengan raksasa", oldCityScene, 25, 15, 
            "Negosiasi dengan raksasa", oldCityScene, 10, 25, 
            "Memanfaatkan kecerobohan raksasa", oldCityScene, 20, 20);

        Scene snakeScene = new Scene("Kamu sedang bertarung dengan ular raksasa yang menghadang jalan keluar goa.",
            "Menyerang penuh", giantScene, 20, 10, 
            "Counter Attack", giantScene, 15, 15, 
            "Defensif", giantScene, 10, 20);

        Scene introScene = new Scene("Kamu terbangun dari tidur panjang di dalam Goa. Kamu disediakan 3 kotak yang berisi perlengkapan petualang. Kotak Paladin berisi armor baja + pedang besar. Kotak Knight berisi armor kayu + pedang panjang. Kotak Assassin berisi armor kulit + 2 pedang kecil. Pilihanmu menentukan role game dan efek yang diberikan.",
            "Memilih Kotak Paladin", snakeScene, 3, 10, 
            "Memilih Kotak Knight", snakeScene, 5, 15, 
            "Memilih Kotak Assassin", snakeScene, 1, 20);       

       
     
        Character mainPlayer = new Character(100, "Lynx");

        Story story = new Story(introScene, mainPlayer);

        story.start();
    }
}

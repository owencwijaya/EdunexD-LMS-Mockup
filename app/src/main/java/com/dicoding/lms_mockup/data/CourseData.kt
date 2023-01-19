package com.dicoding.lms_mockup.data

import com.dicoding.lms_mockup.R

object CourseData {
    private val courseNames = mapOf(
        "IF2121 Logika Komputasional" to 2,
        "IF2110 Algoritma dan Struktur Data" to 4,
        "IF2120 Matematika Diskrit" to 3,
        "IF2124 Teori Bahasa Formal dan Otomata" to 3,
        "IF2123 Aljabar Linear dan Geometri" to 3,
        "IF2130 Organisasi dan Arsitektur Komputer" to 3,
        "IF2210 Pemrograman Berorientasi Objek" to 3,
        "IF2211 Strategi Algoritma" to 3,
        "IF2220 Probabilitas dan Statistika" to 3,
        "IF2230 Sistem Operasi" to 3,
        "IF2240 Basis Data" to 3,
        "IF2250 Rekayasa Perangkat Lunak" to 3
    )

    private val courseDetails = arrayOf(
        "Kuliah ini membahas bagaimana proses penalaran manusia ditirukan oleh komputer, dari kumpulan fakta yang ada diturunkan menjadi fakta baru.\n\n" +
        "Materi yang diberikan pada kuliah ini mencakup:\n\n" +
        "- Pengantar computational logic, representasi propositional logic mencakup sintaks dan semantic\n" +
        "- Berbagai teknik pembuktian dari pendekatan semantic reasoning maupun proof method untuk propositional logic dan relational logic\n"+
        "- paradigm pemrograman deklaratif yang menggunakan dasar relational logic untuk melakukan penalaran\n",

        "Mata kuliah ini memberikan pemahaman atas konsep algoritma dan struktur data yang umum dipakai di bidang informatika/ilmu komputer, dan (2) keahlian dalam mendesain dan menggunakan algoritma        dan struktur data yang baik untuk memecahkan persoalan, dan (3) membangun program dengan paradigma prosedural skala menengah dengan bahasa pemrograman C.\n\n" +
        "Materi yang diberikan pada kuliah ini  mencakup: \n\n" +
        "- Konsep dasar struktur data dalam pemrograman prosedural\n" +
        "- Modularisasi program, scope dan life time variabel\n" +
        "- Mesin abstrak, dan tipe data abstrak : dasar, tabel, matriks, stack, queue, list, binary tree\n" +
        "- Konsep, primitif, operasi, dan pemakaian ADT dengan berbagai variasi representasi\n" +
        "- Algoritma yang relevan dengan masing-masing struktur data: sequential processing (traversal, searching), sorting, insert, update delete, reverse\n" +
        "- Pemrograman prosedural dengan bahasa C & studi kasus\n",

        "Mahasiswa dapat memahami konsep dasar matematika diskrit sehingga mampu memodelkan persoalan di dunia nyata dengan menggunakan konsep-konsep tersebut. " +
        "Kuliah ini mengajarkan konsep dasar dan berbagai terminologi sebagai bekal untuk memahami berbagai kuliah lanjutan di Bidang Informatika.",


        "Mata kuliah TBFO memberikan pengetahuan pendukung dan keahlian dalam merancang Finite Automata, Regular Expression, dan Pushdown Automata serta pengantar Turing Machine.\n\n" +
        "Materi yang diberikan pada kuliah ini mencakup:\n\n" +
        "- Bahasa formal dalam model komputasi dan proof technique\n" +
        "- Regular language, regular expression, finite automata (deterministic, nondeterministic, nondeterministic with epsilon)\n" +
        "_ Konversi antar finite automata, context free languages, pushdown automata, berbagai aplikasi automaton, turing machine\n",


        "Materi yang diberikan pada mata kuliah ini mencakup:\n\n" +
        "- Aljabar elementer, aljabar bilangan kompleks, aljabar vektor, aljabar quaternion\n" +
        "- Matriks dan transformasi linier, aljabar matriks\n" +
        "- Sistem persamaan linier, vektor eigen dan nilai eigen\n" +
        "- Aljabar geometrik dan operasinya, aplikasi aljabar geometrik dalam geometri, misalnya pencerminan dan rotasi\n",

        "Materi yang diberikan pada mata kuliah ini mencakup:\n\n" +
        "- Pengantar arsitektur computer: system computer\n" +
        "- Representasi data: byte, string, integer, floating points\n" +
        "- Representasi level mesin: konsep, format data, modus pengalamatan, operasi aritmetika dan logika\n" +
        "- Kendali, prosedur, alokasi array, struktur data heterogen\n" +
        "- Ccompile, linking dan optimasi program: static linking, dynamic linking\n" +
        "- Symbol dan table symbol, file object shared libraries, file biner executable\n" +
        "- Hierarki memory: teknologi penyimpanan, cache, RAM, disk, solid state I/O\n" +
        "- Interrupt: sinyal, exception, I/O utk level system File\n",

        "Mata kuliah PBO memberikan pemahaman atas konsep dan keahlian dalam menmbangun program dengan paradigma berorientasi objek dengan 3 bahasa pemrograman.\n\n" +
        "Materi yang diberikan pada mata kuliah ini mencakup:\n\n" +
        "- Konsep dan praktek pengembangan program aplikasi dan komponen perangkat lunak dengan OOP menggunakan fitur lanjut OOP\n" +
        "- Praktek menggunakan tiga bahasa pemrograman (C++, Java, C#)\n" +
        "- Paradigma berorientasi objek: kelas, objek, masa hidup objek, operasi-dasar objek, generik, inheritance dan polymorphism, exception and assertion\n" +
        "- Konsep dan implementasi tipe data abstrak(ADT), mesin abstrak, dan proses in OOP (Pemrograman OO) dengan 3 bahasa yang dipilih (C++, Java, C#)\n",

        "Materi yang diberikan pada mata kuliah ini mencakup:\n\n" +
        "- Kompleksitas algoritma" +
        "- Brute Force Algorithms" +
        "- Greedy Algorithms" +
        "_ Divide and Conquer Algorithms" +
        "- Searching Algorithms (DFS and BFS)" +
        "- Backtracking Algorithms" +
        "- Branch and Bound Algorithms" +
        "- Dynamic Programming dan String Matching" +
        "- NP Theory",

        "Kuliah ini mendeskripsikan materi tentang probability dan dilanjutkan dengan statistik sebagai salah satu pendekatan pengambilan keputusan dengan memanfaatkan komputer. Kuliah ini lebih  diarahkan pada pemanfaatan teori peluang dan statistika, dan tidak berfokus pada penjelasan detil mengenai formula-formula pada teori peluang dan statistika.\n\n" +
        "Materi yang diberikan pada mata kuliah ini mencakup:\n\n"+
        "- Probabilitas dan variabel random\n" +
        "- Teori Bayes\n" +
        "- Distribusi peluang dari variabel random\n" +
        "- Ekspektasi matematika dari suatu kejadian\n" +
        "- Distribusi sampel\n" +
        "- Estimasi parameter populasi dan uji hipotesis\n" +
        "- Pemanfaatan regresi linear untuk melakukan prediksi\n",

        "Materi yang diberikan pada mata kuliah ini mencakup:\n\n"+ "" +
        "- Konsep sistem operasi\n" +
        "- Manajemen proses dan memori\n" +
        "- Manajemen file dan device I/O\n" +
        "- Proteksi dan keamanan sistem komputer\n" +
        "- Sistem operasi untuk sistem terdistribusi\n",

        "Mata kuliah ini memberikan pengetahuan mengenai sistem basis data secara umum, mencakup arsitektur sistem basis data, pemodelan data, perancangan skema basis data relasional, pemanfaatan dan pengelolaan data.\n\n" +
        "Materi yang diberikan pada mata kuliah ini mencakup:\n\n" +
        "- Latar belakang kebutuhan sistem basis data dalam mendukung kebutuhan informasi\n" +
        "- Pengorganisasian data di dalam file\n" +
        "- Berbagai pendekatan dalam pemodelan data\n" +
        "- Pemodelan data di level konseptual dengan menggunakan pemodelan entity-relationship\n" +
        "- Model data relasional dan operasi relasional dengan aljabar relasional dan kalkulus relasional\n" +
        "- Perancangan skema basis data relasional dengan normalisasi berdasarkan functional dependency",

        "Kuliah ini memberikan pengertian tentang rekayasa perangkat lunak dan kemampuan dasar dalam pembangunan perangkat lunak skala kecil dan sederhana, mencakup kemampuan melakukan analisis kebutuhan perangkat lunak dan perancangan perangkat lunak, mengoperasikan berbagai alat bantu terkait pemodelan hasil analisis dan perancangan, manajemen konfigurasi perangkat lunak, dan pengujian.\n\n" +
        "Materi yang diberikan pada mata kuliah ini mencakup:\n\n" + "" +
        "- Tipe perangkat lunak (P/L); pengantar rekayasa P/L; siklus hidups P/L, mencakup pengumpulan kebutuhan, analisis, perancangan, implementasi, pengujian, pengoperasian, dan perawatan\n" +
        "- Berbagai model proses, mencakup waterfall, prototyping, incremental, agile process model, dll; metodologi pembangunan P/L (termasuk metode berorientasi objek): kelebihan, kekurangan dan aspek praktisnya di industry\n" +
        "- Analisis dan perancangan P/L; standard dan dokumentasi P/L, mencakup SDD, SRS, SDD, STP\n" +
        "- Alat bantu pemodelan P/L, mencakup UML dan DFD\n" +
        "- Manajemen konfigurasi perangkat lunak, termasuk version control\n" +
        "- Pengujian P/L mencakup perencanaan pengujian, perancangan kasus uji, dan alat bantu pengujian otomatis\n"
    )

    private val courseImages = intArrayOf(
        R.drawable.logkom,
        R.drawable.alstrukdat,
        R.drawable.matdis,
        R.drawable.tbfo,
        R.drawable.algeo,
        R.drawable.orkom,
        R.drawable.oop,
        R.drawable.stima,
        R.drawable.probstat,
        R.drawable.os,
        R.drawable.basdat,
        R.drawable.rpl
    )

    val courseList: ArrayList<Course>
        get() {
            val list = arrayListOf<Course>()
            var count = 0

            for (entry in courseNames.entries.iterator()){
                list.add(Course(entry.key, entry.value, courseDetails[count], courseImages[count]))
                count += 1
            }
            return list
        }
}
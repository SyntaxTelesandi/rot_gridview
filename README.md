# rot_gridview
This repository learns about how to create a gridview. gridview example is taken from the "Republic of Telesandi" Application project

indonesia : 

repositori ini mempelajari tentang cara membuat sebuah gridview. contoh gridview di ambil dari projek Aplikasi "Republic of Telesandi"

# How to Build Grid
in the grid you can create the grid as you wish, well like you want to create for example 3 colom grid this way:

Indonesia : 

dalam grid tersebut anda dapat membuat grid sesuai yang anda inginkan, yah seperti anda ingin membuat misalnya 3 colom grid dengan cara seperti ini :

```javascript

Open the xml in project (activity_main.xml)

                <GridView
                    android:id="@+id/gridview"
                    android:layout_width="fill_parent"
                    android:layout_height="fill_parent"
                    android:layout_margin="4dp"
                    android:columnWidth="80dp"
                    android:gravity="center"
                    android:numColumns="3" --> Untuk Merubah Kolom Gridview Sesuai Keinginan Anda || To Change the Gridview Column As You Desire
                    android:stretchMode="columnWidth"/>
```

# Screenshoot

![alt text](https://github.com/kataponcoe/rot_gridview/blob/master/screenshoot/gridview.png?raw=true)

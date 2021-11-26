# JayenInterface Web Service
*Web service untuk menghubungkan toko dengan pabrik dorayaki DORAEMONANGIS*

# Skema Basis Data
1. resep = (id_resep, nama_resep) primary key (id_resep)
2. bahan_resep = (id_resep, bahan_baku, jumlah) primary key (id_resep,bahan_baku)
3. bahan_baku = (nama_bahan, stok) primary key (nama_bahan)
4. admin = (username, password, email, refresh_token) primary key (username)
5. request_toko = (id_request, ip,varian, jumlah_penambahan,status) primary key (id_request)
6. log_request_toko = (id_log, ip, endpoint, timestamp) primary key (log_request)
Foreign key :
bahan_resep (id_resep) -> resep (id_resep)
bahan_resep (bahan_baku) -> bahan_baku (nama_bahan)

# Pembagian tugas
1. Rate Limiter: 13519115
2. Add stok request: 13519115
3. See Request: 13519115
4. Get variant list 13519075
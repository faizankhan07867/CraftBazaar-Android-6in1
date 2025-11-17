# CraftBazaar-Android-6in1


CraftBazaar-Android-6in1/
│
├── app/
│   ├── src/main/java/com/craftbazaar/
│   │   ├── adapter/          → ProductAdapter.kt
│   │   ├── data/             → Product.kt, AppDatabase.kt, ProductDao.kt
│   │   ├── network/          → ApiService.kt, RetrofitClient.kt
│   │   ├── repository/       → ProductRepository.kt
│   │   ├── ui/
│   │   │   ├── activity/     → MainActivity.kt, SplashActivity.kt
│   │   │   ├── fragment/     → HomeFragment.kt, DetailFragment.kt, CartFragment.kt, ProfileFragment.kt
│   │   │   └── viewmodel/    → ProductViewModel.kt
│   └── res/
│       ├── layout/           → activity_main.xml, fragment_home.xml, item_product.xml, fragment_detail.xml
│       ├── drawable/         → ic_craft_logo.xml, bg_splash.xml
│       ├── menu/             → drawer_menu.xml
│       └── values/themes.xml (Material 3)
│
├── screenshots/                  ← 6-8 HD screenshots daal dena (must for submission)
├── videos/                       ← 30-sec demo video (optional but killer)
├── app-release.apk               ← Final signed APK (professor ko dikha de)
├── README.md                     ← Sabse important (niche diya)
└── .gitignore



# CraftBazaar – Handmade Shopping App (6-in-1 Android Project)  

**A complete modern Android app for handmade craft products**  
6 semester requirements completed in **one single production-level app** using **Kotlin + Jetpack + Material Design 3**

**Live APK** → Check Releases tab  
**Demo Video** → videos/demo.mp4  
**GitHub** → https://github.com/faizankhan07867/CraftBazaar-Android-6in1

## 6 Projects Completed (November 17, 2025)

| # | Requirement                        | Technology Used                          | Status   |
|---|------------------------------------|------------------------------------------|----------|
| 1 | Product Listing Screen             | RecyclerView + GridLayout + CardView + Glide | Done     |
| 2 | Navigation Drawer                  | Navigation Component + DrawerLayout       | Done     |
| 3 | Product Detail Screen              | Rich media, rating, description, add-to-cart | Done     |
| 4 | API Integration                    | Retrofit + FakeStoreAPI / DummyJSON       | Done     |
| 5 | Local Database                     | Room + Coroutines + Offline First        | Done     |
| 6 | Splash Screen & Branding           | Custom logo + 3-second animation         | Done     |

## Features
- Beautiful splash screen with brand logo
- Smooth navigation drawer (Home • Categories • Cart • Profile)
- Fast product listing with real images
- Full product detail page with zoomable images
- Offline support – works without internet after first load
- Material You design + Dark mode ready

## Tech Stack (2025 Latest)
- Kotlin • MVVM • Retrofit • Room Database
- Navigation Component • ViewBinding • Coroutines
- Glide • Material Design 3

## How to Run
```bash
1. Clone repo
2. Open in Android Studio Giraffe | Hedgehog | Iguana
3. Sync Gradle → Run on device/emulator
4. First run: Loads from API → Saves to Room
5. Next run: Works completely offline!

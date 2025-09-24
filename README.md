                ┌────────────────────────┐
                │        Client           │
                │ (Postman / Browser UI) │
                └───────────▲────────────┘
                            │ HTTP (JSON)
                            │
                ┌───────────┴────────────┐
                │     Controller Layer    │
                │   (ProductController)   │
                └───────────▲────────────┘
                            │ Calls Service
                            │
                ┌───────────┴────────────┐
                │      Service Layer      │
                │  ProductService (Impl)  │
                └───────────▲────────────┘
                            │ Uses Repository
                            │
                ┌───────────┴────────────┐
                │   Repository Layer      │
                │   ProductRepository     │
                │ (extends JpaRepository) │
                └───────────▲────────────┘
                            │ JPA / SQL
                            │
                ┌───────────┴────────────┐
                │       Database          │
                │     (products table)    │
                └────────────────────────┘

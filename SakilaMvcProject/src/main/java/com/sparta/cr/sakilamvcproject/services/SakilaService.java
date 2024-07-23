package com.sparta.cr.sakilamvcproject.services;

import com.sparta.cr.sakilamvcproject.repositories.*;
import org.springframework.stereotype.Service;

@Service
public class SakilaService {

    private final ActorRepository actorRepository;
    private final AddressRepository addressRepository;
    private final CategoryRepository categoryRepository;
    private final CityRepository cityRepository;
    private final CountryRepository countryRepository;
    private final CustomerRepository customerRepository;
    private final FilmActorRepository filmActorRepository;
    private final FilmCategoryRepository filmCategoryRepository;
    private final FilmRepository filmRepository;
    private final FilmTextRepository filmTextRepository;
    private final InventoryRepository inventoryRepository;
    private final LanguageRepository languageRepository;
    private final PaymentRepository paymentRepository;
    private final RentalRepository rentalRepository;
    private final StaffRepository staffRepository;
    private final StoreRepository storeRepository;

    SakilaService(ActorRepository actorRepository, AddressRepository addressRepository, CategoryRepository categoryRepository,
                  CityRepository cityRepository, CountryRepository countryRepository, CustomerRepository customerRepository,
                  FilmActorRepository filmActorRepository, FilmCategoryRepository filmCategoryRepository, FilmRepository filmRepository,
                  FilmTextRepository filmTextRepository, InventoryRepository inventoryRepository, LanguageRepository languageRepository,
                  PaymentRepository paymentRepository, RentalRepository rentalRepository, StaffRepository staffRepository, StoreRepository storeRepository){

        this.actorRepository = actorRepository;
        this.addressRepository = addressRepository;
        this.categoryRepository = categoryRepository;
        this.cityRepository = cityRepository;
        this.countryRepository = countryRepository;
        this.customerRepository = customerRepository;
        this.filmActorRepository = filmActorRepository;
        this.filmCategoryRepository = filmCategoryRepository;
        this.filmRepository = filmRepository;
        this.filmTextRepository = filmTextRepository;
        this.inventoryRepository = inventoryRepository;
        this.languageRepository = languageRepository;
        this.paymentRepository = paymentRepository;
        this.rentalRepository = rentalRepository;
        this.staffRepository = staffRepository;
        this.storeRepository = storeRepository;
    }
}

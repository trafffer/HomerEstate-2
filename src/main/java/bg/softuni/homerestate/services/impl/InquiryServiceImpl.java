package bg.softuni.homerestate.services.impl;

import bg.softuni.homerestate.models.entities.Inquiry;
import bg.softuni.homerestate.models.entities.Offer;
import bg.softuni.homerestate.models.service.InquiryServiceModel;
import bg.softuni.homerestate.repositories.InquiryRepository;
import bg.softuni.homerestate.services.InquiryService;
import bg.softuni.homerestate.services.OfferService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class InquiryServiceImpl implements InquiryService {
    private final InquiryRepository inquiryRepository;
    private final ModelMapper mapper;
    private final OfferService offerService;

    public InquiryServiceImpl(InquiryRepository inquiryRepository, ModelMapper mapper, OfferService offerService) {
        this.inquiryRepository = inquiryRepository;
        this.mapper = mapper;
        this.offerService = offerService;
    }

    @Override
    public void saveInquiry(InquiryServiceModel inquiryServiceModel,Long id) {
          Offer offer = offerService.getOfferEntity(id);
          inquiryServiceModel.setOffer(offer);
          inquiryServiceModel.setCreatedOn(LocalDateTime.now());
          Inquiry inquiry = mapper.map(inquiryServiceModel,Inquiry.class);
          inquiryRepository.save(inquiry);
          System.out.println("The inquiry has been saved to the database");
    }
}

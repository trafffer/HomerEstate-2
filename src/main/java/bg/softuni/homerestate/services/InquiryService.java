package bg.softuni.homerestate.services;

import bg.softuni.homerestate.models.service.InquiryServiceModel;

public interface InquiryService {
    void saveInquiry(InquiryServiceModel inquiryServiceModel,Long id);
}

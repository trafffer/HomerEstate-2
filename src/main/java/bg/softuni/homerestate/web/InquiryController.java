package bg.softuni.homerestate.web;

import bg.softuni.homerestate.models.binding.InquiryAddBindingModel;
import bg.softuni.homerestate.models.service.InquiryServiceModel;
import bg.softuni.homerestate.services.InquiryService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/inquiries")
public class InquiryController {
    private final ModelMapper modelMapper;
    private final InquiryService inquiryService;

    public InquiryController(ModelMapper modelMapper, InquiryService inquiryService) {
        this.modelMapper = modelMapper;
        this.inquiryService = inquiryService;
    }

    @GetMapping("/add")
    public String addInquiry(@RequestParam Long id, Model model){
        if (!model.containsAttribute("inquiryModel")){
            model.addAttribute("inquiryModel", new InquiryAddBindingModel());
            model.addAttribute("offerModel",id);
        }
        //    TODO: to add connection to the site: All inquiries...
        return "inquiries";
    }


    @PostMapping("/add/{id}")
    public String addInquiryConfirm(@PathVariable("id") Long id,
                                    @Valid InquiryAddBindingModel inquiryModel,
                                    BindingResult bindingResult,
                                    RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("inquiryModel",inquiryModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.inquiryModel",bindingResult);
            redirectAttributes.addFlashAttribute("offerModel",id);
            return "redirect:/comments/search/{id}";
        }
        InquiryServiceModel serviceModel = modelMapper.map(inquiryModel,InquiryServiceModel.class);
        inquiryService.saveInquiry(serviceModel,id);
        return "redirect:/";
    }
}

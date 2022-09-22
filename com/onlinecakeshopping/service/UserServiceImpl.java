package com.onlinecakeshopping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinecakeshopping.dao.CakeRepository;
import com.onlinecakeshopping.dao.CartRepository;
import com.onlinecakeshopping.dao.FeedbackRepository;
import com.onlinecakeshopping.dao.RaiseComplaintRepository;

import com.onlinecakeshopping.model.Cake;
import com.onlinecakeshopping.model.Cart;
import com.onlinecakeshopping.model.Feedback;
import com.onlinecakeshopping.model.RaiseComplaint;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private FeedbackRepository feedbackRepo;
	


	@Autowired
	private CakeRepository cakeRepo;
	
	

	@Autowired
	private CartRepository cartRepo;
	
	

	@Autowired
	private RaiseComplaintRepository raiseRepo;
	
	@Override
	public Feedback giveFeedback(Feedback feedback) {
		
		Feedback userFeedback = feedbackRepo.saveAndFlush(feedback);
		return userFeedback;
	}
	
	public List<Cake> viewAllCakes() {
		List<Cake> res=cakeRepo.findAll();
		return res;
	}
	
	
	
	@Override
	public RaiseComplaint raiseCompliant(RaiseComplaint raisecomplaint) {
		RaiseComplaint raise = raiseRepo.saveAndFlush(raisecomplaint);
		return raise;
	}
	
	public Cake deleteCakebyId(int cakeId) {
		
		cartRepo.deleteById(cakeId);
		return null;
		}
		
	
		
	
	@Override
	public Cake getById(int cakeId) {
	
		Optional<Cake> cake=cakeRepo.findById(cakeId);
		return cake.get();
		}
	
	@Override
	public Cart addcakeToCart(Cart cart) {
		Cart addtocart=cartRepo.saveAndFlush(cart);
		return addtocart;
	}

	public List<Cart> viewCart() {
		
		List<Cart> viewCart = cartRepo.findAll();
		return viewCart;
	}
	

}

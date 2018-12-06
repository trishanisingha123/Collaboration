package com.niit.dao;

import com.niit.models.ProfilePicture;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class ProfilePictureDaoImpl implements ProfilePictureDao {
	@Autowired
private SessionFactory sessionFactory;
	public ProfilePicture saveOrUpdateProfilePic(ProfilePicture profilePicture) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(profilePicture);//insert or update
		return profilePicture;
	}

	public ProfilePicture getImage(String email) {
		Session session=sessionFactory.getCurrentSession();
		ProfilePicture profilePicture=(ProfilePicture) session.get(ProfilePicture.class, email);
		return profilePicture;
	}

}
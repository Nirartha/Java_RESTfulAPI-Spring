package com.main.Springboot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.main.Springboot.Dao.MemberDao;
//import com.main.Springboot.Model.MemberAccountJPA;
import com.main.Springboot.Model.MemberHelper;
import com.main.Springboot.Model.ResponseCheckPwModel;


@Service
public class MemberService {
	
	@Autowired
	MemberHelper mHelper;
	
	@Autowired
	ResponseCheckPwModel resCheckPwModel;
	
//	@Autowired
//	MemberDao memberdao;
	
	public enum ResponseCheckMessageType {
		NoError {
			public String toString() {
				return "No Error";
			}
		},
		LowercaseError {
			public String toString() {
				return "Please contain a lowercase letter at least.";
			}
		},
		NumericalError {
			public String toString() {
				return "Please contain a numerical digital at least.";
			}
		},
		LengthError {
			public String toString() {
				return "Please contain between 5 and 12 characters in length.";
			}
		},
		SequenceError {
			public String toString() {
				return "Please NOT contain any sequence of characters immediately followed by the same sequence.";
			}
		};
	}
	
	public ResponseCheckPwModel checkPassword(String password) {
		
		resCheckPwModel = new ResponseCheckPwModel();
		
		if(!mHelper.isContainLowercaseLetters(password)) {
			resCheckPwModel.setMessage(ResponseCheckMessageType.LowercaseError.toString());
		} else if(!mHelper.isContainNumericalDigits(password)) {
			resCheckPwModel.setMessage(ResponseCheckMessageType.NumericalError.toString());
		} else if(!mHelper.isPwLength5to12Characters(password)) {
			resCheckPwModel.setMessage(ResponseCheckMessageType.LengthError.toString());
		} else if(mHelper.isContainSameSequence(password)) {
			resCheckPwModel.setMessage(ResponseCheckMessageType.SequenceError.toString());
		} else {
			resCheckPwModel.setMessage(ResponseCheckMessageType.NoError.toString());
		}
		
		return resCheckPwModel;
	}
	
//	public void newMember(MemberAccountJPA memberaccountJpa) {
//		memberdao.newMember(memberaccountJpa);
//	}
}

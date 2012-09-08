package com.android.matcalc;

public enum KeypadButtons {
	ADD(R.string.add_sub_url, R.string.add),
	SUBTRACT(R.string.add_sub_url, R.string.subtract),
	MULTIPLY(R.string.multiply_url, R.string.multiply),
	SOLVE(R.string.solve_url, R.string.solve),
	DET(R.string.det_url, R.string.det),
	INV(R.string.inv_url, R.string.inv),
	POW2(R.string.multiply_url, R.string.pow2),
	POW3(R.string.multiply_url, R.string.pow3),
	TRANSPOSE(R.string.transpose_url, R.string.trans),
	RANK(R.string.rank_url, R.string.rank),
	TRACE(R.string.trace_url, R.string.trace),
	EIGVALUE(R.string.eigen_url, R.string.eigValue),
	EIGVECTOR(R.string.eigen_url, R.string.eigVector),
	NORM1(R.string.norm_url, R.string.norm1),
	NORM2(R.string.norm_url, R.string.norm2),
	NORMINF(R.string.norm_url, R.string.normInf),
	LUL(R.string.lu_url, R.string.lul),
	LUU(R.string.lu_url, R.string.luu),
	SWAP(R.string.google_url, R.string.swap),
	CLEARA(R.string.google_url, R.string.clear),
	DUMMY(R.string.google_url, R.string.dummy);

	int mUrlId;
	int mTxtId;
	
	KeypadButtons(int urlId, int txtId){
		mUrlId = urlId;
		mTxtId = txtId;
	}
	
	public int getUrlId(){
		return mUrlId;
	}
	
	public int getTxtId(){
		return mTxtId;
	}
	
}

//public enum KeypadButtons {
//	ADD("A+B", R.string.add_sub_url),
//	SUBTRACT("A-B", R.string.add_sub_url),
//	MULTIPLY("AB", R.string.multiply_url),
//	SOLVE("AX=B", R.string.solve_url),
//	DET("|A|", R.string.det_url),
//	INV("A^-1", R.string.inv_url),
//	POW2("A^2", R.string.multiply_url),
//	POW3("A^3", R.string.multiply_url),
//	TRANSPOSE("A'", R.string.transpose_url),
//	RANK("RK(A)", R.string.rank_url),
//	TRACE("TR(A)", R.string.trace_url),
//	EIGVALUE("D(A)", R.string.eigen_url),
//	EIGVECTOR("V(A)", R.string.eigen_url),
//	NORM1("||A||1", R.string.norm_url),
//	NORM2("||A||2", R.string.norm_url),
//	NORMINF("||A||Inf", R.string.norm_url),
//	LUL("LU:L", R.string.lu_url),
//	LUU("LU:U", R.string.lu_url),
//	SWAP("swap", R.string.google_url),
//	CLEARA("clr(A)", R.string.google_url),
//	DUMMY("", R.string.google_url);
//
//	CharSequence mText;
//	int mUrlId;
//	
//	KeypadButtons(CharSequence text, int urlId){
//		mUrlId = urlId;
//		mText = text;
//	}
//	
//	public CharSequence getText(){
//		return mText;
//	}
//	
//	public int getUrlId(){
//		return mUrlId;
//	}
//	
//}


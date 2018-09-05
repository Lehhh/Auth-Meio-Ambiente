package br.com.autenticacao.app;

import static org.bytedeco.javacpp.opencv_face.createEigenFaceRecognizer;

import org.bytedeco.javacpp.opencv_face.FaceRecognizer;
import org.bytedeco.javacv.FrameGrabber.Exception;

import br.com.autenticacao.app.controller.Capture;

public class Main {

	public static void main(String[] args) throws Exception {

		FaceRecognizer r = createEigenFaceRecognizer();
		
		Capture cp = new Capture();
		cp.captureFace();
		
	}

}

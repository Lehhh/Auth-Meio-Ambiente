package br.com.autenticacao.app.controller;

import java.awt.event.KeyEvent;

import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber.Exception;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.OpenCVFrameGrabber;

public class Capture {

	public void captureFace() throws Exception {
		KeyEvent tecla = null;
		OpenCVFrameConverter.ToMat converteMat = new OpenCVFrameConverter.ToMat();
		OpenCVFrameGrabber camera = new OpenCVFrameGrabber(0);
		camera.start();

		CanvasFrame cFrame = new CanvasFrame("Preview", CanvasFrame.getDefaultGamma() / camera.getGamma());
		Frame frameCapturado = null;
		while ((frameCapturado = camera.grab()) != null) {
			if (cFrame.isVisible()) {
				cFrame.showImage(frameCapturado);
			}

		}
	}
}

package imageBrowser.Control;

import imageBrowser.UI.ImageViewer;

public class NextImageCommand extends ImageCommand {

    public NextImageCommand(ImageViewer viewer) {
        super(viewer);
    }
    
    @Override
    public void execute() {
        this.getViewer().showNextImage();
    }

}

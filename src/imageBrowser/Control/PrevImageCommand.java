package imageBrowser.Control;

import imageBrowser.UI.ImageViewer;

public class PrevImageCommand extends ImageCommand {

    public PrevImageCommand(ImageViewer viewer) {
        super(viewer);
    }
    
    @Override
    public void execute() {
        this.getViewer().showPrevImage();
    }
    
    

}

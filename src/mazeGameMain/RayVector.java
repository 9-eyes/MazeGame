package mazeGameMain;

/**RayVectors are used for ray tracing, and include the nessesary collision reporting.
 * Extends {@link Vector3D}.
 * @author 9-eyes**/
public class RayVector extends Vector3D {

	
	
	/**RayVector constructor. 
	 * @see {@link Vector3D}**/
	public RayVector(float x, float y, float z, float dx, float dy, float dz) {
		super(x, y, z, dx, dy, dz);
	}

	/**RayVector constructor - Rays cannot be a point, so the amplitude is set to zero. 
	 * @see {@link Vector3D}**/
	public RayVector(float x, float y, float z) {
		super(x, y, z, 0f, 0f, 0f);
	}

}

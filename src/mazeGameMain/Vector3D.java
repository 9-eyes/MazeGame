package mazeGameMain;

/**Vector3D can be either a point or a point+amplitude in 3D space.
 * @see {@link Vector3D(float, float, float, float)}
 * @author 9-eyes**/
public class Vector3D {
	
	/**is this object a point in space [true], or a vector [false]?**/
	public boolean isPoint;
	
	/**position coordinate. set to origin by default**/
	public float posX, posY, posZ = 0f;
	
	/**amplitude coordinate. may not exist.**/
	public float ampX, ampY, ampZ;
	
	/**returns an array of length three in structure [posX, posY, posZ]**/
	public float[] posToArray() {
		float[] posArray = {posX, posY, posZ};
		return posArray;
	}
	
	/**returns an array of length three in structure [ampX, ampY, ampZ]. throws error if they do not exist.**/
	public float[] ampToArray() {
		if (isPoint) {
			NullPointerException err = new NullPointerException("Vector3D ampToArray() method called on a point");
			throw err;
		} else {
			float[] ampArray = {ampX, ampY, ampZ};
			return ampArray;
		}
	}
	
	/**returns an array of length six in structure [posX, posY, posZ, ampX, ampY, ampZ]. throws error if amplitudes do not exist.**/
	public float[] toArray() {
		if (isPoint) {
			NullPointerException err = new NullPointerException("Vector3D toArray() method called on a point");
			throw err;
		} else {
			float[] vectArray = {posX, posY, posZ, ampX, ampY, ampZ};
			return vectArray;
		}
	}
	
	/**3D vector constructor. x y z is the location, dx dy dz is the amplitude. the amplitude is optional.**/
	public Vector3D(float x, float y, float z, float dx, float dy, float dz) {
		isPoint = false;
		posX = x;
		posY = y;
		posZ = z;
		ampX = dx;
		ampY = dy;
		ampZ = dz;
	}
	
	/**3D vector constructor. x y z is the location. use the other constructor if you require amplitudes.**/
	public Vector3D(float x, float y, float z) {
		isPoint = true;
		posX = x;
		posY = y;
		posZ = z;
	}

}


public class Network {

	private double[][] output;
	private double[][][] weight;
	private double[][] bias;
	
	
	
	
	
	public final int[] NETWORK_LAYER_SIZE;
	public final int	INPUT_SIZE;
	public final int	OUTPUT_SIZE;
	public final int	NETWORK_SIZE;
	
	public Network(int... NETWORK_LAYER_SIZE) {
		this.NETWORK_LAYER_SIZE = NETWORK_LAYER_SIZE;
		this.INPUT_SIZE = NETWORK_LAYER_SIZE[0];
		this.NETWORK_SIZE = NETWORK_LAYER_SIZE.length;
		this.OUTPUT_SIZE = NETWORK_LAYER_SIZE[NETWORK_SIZE - 1];
		
		this.output = new double[NETWORK_SIZE][];
		this.weight = new double[NETWORK_SIZE][][];
		this.bias 	= new double[NETWORK_SIZE][];
		
		for(int i = 0 ; i < NETWORK_SIZE ; i++) {
			this.output[i] = new double[NETWORK_LAYER_SIZE[i]];
			this.bias[i] = new double[NETWORK_LAYER_SIZE[i]];
			
			if(i > 0) {
				weight[i] = new double[NETWORK_LAYER_SIZE[i]][NETWORK_LAYER_SIZE[i-1]]; 
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Network net = new Network(4,1,3,4);
	}
	
}
